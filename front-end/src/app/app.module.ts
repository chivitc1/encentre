import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ChatAppComponent } from './chat/chat-app/chat-app.component';
import { ChattingService } from './chat/chatting.service';
import { ChatBotService } from './chat/chat-bot.service';

@NgModule({
  declarations: [
    AppComponent,
    ChatAppComponent
  ],
  imports: [
    BrowserModule,    
    FormsModule,
    NgbModule.forRoot()
  ],
  providers: [ChattingService, ChatBotService],
  bootstrap: [AppComponent]
})
export class AppModule { }
