import { Injectable } from '@angular/core';
import { Subject } from 'rxjs/Subject';
import { ChatMessage } from './chat.model';
import { Observable } from 'rxjs/Observable';
import { ChatBotService } from './chat-bot.service';
import { from } from 'rxjs/observable/from';

@Injectable()
export class ChattingService {

  private sendNextMsg: Subject<ChatMessage> = new Subject<ChatMessage>();
  public msgNotifierObservable = from(this.sendNextMsg);

  constructor(private chatBot: ChatBotService) {
    this.chatBot.msgObservable.subscribe((msg: ChatMessage) => {
      this.sendNextMsg.next(msg);
    });
   }

   public postMessage(msg: ChatMessage) {
     this.chatBot.getNextMessage(msg.messageText);
   }
}
