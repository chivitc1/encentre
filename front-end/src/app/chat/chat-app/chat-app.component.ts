import { Component, OnInit } from '@angular/core';
import { ChatMessage } from '../chat.model';
import { ChattingService } from '../chatting.service';
import { users } from '../chat.config';

@Component({
  selector: 'chat-app',
  templateUrl: './chat-app.component.html',
  styleUrls: ['./chat-app.component.css']
})
export class ChatAppComponent implements OnInit {
  public msgText: string;
  public messages: ChatMessage[] = [];

  constructor(private chattingService: ChattingService) { 
    chattingService.msgNotifierObservable.subscribe((response) => {
      this.messages.unshift(response);
    });
  }

  ngOnInit() {
  }

  public sendMessage() {
    if (this.msgText) {
      let msgToSend: ChatMessage = {
        from: users[0],
        messageText: this.msgText,
        time: new Date()
      };
      this.messages.unshift(msgToSend);
      this.chattingService.postMessage(msgToSend);
      this.msgText = "";
    }
  }

}
