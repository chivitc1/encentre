import { Injectable } from '@angular/core';
import { Subject } from 'rxjs/Subject';
import { ChatMessage } from './chat.model';
import { users } from './chat.config';
import { from } from 'rxjs/observable/from';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class ChatBotService {
  
  private messages: string[];
  private nextMessage: Subject<ChatMessage> = new Subject<ChatMessage>();
  public msgObservable = from(this.nextMessage);

  constructor() {
    this.messages = [
      "How are you?",
      "LOL, I am tweeting it now.",
      "Really? Sad to hear that.",
      "Hmm......",
      "What? I cant beleive!"
    ];
   }

   public getNextMessage(msgText: string) {
      if (msgText.toUpperCase() === "BYE") {
        this.sendMessage("Bye");
        this.nextMessage.complete();
        return;
      }

      // generate random msg
      let msgIndex = Math.floor(Math.random() * 10) % 5;
      setTimeout(() => {
        this.sendMessage(this.messages[msgIndex]);
      }, 1000);
   }

  sendMessage(responseMsg: string) {
    this.nextMessage.next(
      {
        from: users[1],
        messageText: responseMsg,
        time: new Date()
      }
    )
  }
}
