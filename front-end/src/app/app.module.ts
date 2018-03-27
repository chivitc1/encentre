import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SearchCityComponent } from './city/search-city/search-city.component';
import { ArticlesComponent } from './article/articles/articles.component';
import { AddComponent } from './article/add/add.component';

@NgModule({
  declarations: [
    AppComponent,
    SearchCityComponent,
    ArticlesComponent,
    AddComponent
  ],
  imports: [
    BrowserModule,    
    FormsModule,
    HttpClientModule,
    NgbModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
