import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-search-city',
  templateUrl: './search-city.component.html',
  styleUrls: ['./search-city.component.css']
})
export class SearchCityComponent {

  _search = "Atalanta";
  _result = {};
  
  constructor(private _http: HttpClient) { }

  doSearchConcatenateUrl() {
    const concatenatedUrl: string = "https://trailapi-trailapi.p.mashape.com?q[city_cont]=" +
      encodeURIComponent(this._search);
    const mashapeKey =
      'OxWYjpdztcmsheZU9AWLNQcE9g9wp1qdRkFjsneaEp2Yf68nYH';
    const httpHeaders: HttpHeaders = 
      new HttpHeaders(
      {
        'Content-Type': 'application/json',
        'X-Mashape-Key': mashapeKey
      });
    this._http.get(concatenatedUrl, { headers: httpHeaders})
        .subscribe(res => {
          this._result = res;
        });
  }

  doSearchHttpParams1() {
    const url: string = 'https://trailapi-trailapi.p.mashape.com';
    const mashapeKey = 'OxWYjpdztcmsheZU9AWLNQcE9g9wp1qdRkFjsneaEp2Yf68nYH';
    const httpHeaders: HttpHeaders = 
      new HttpHeaders(
      {
        'Content-Type': 'application/json',
        'X-Mashape-Key': mashapeKey
      });
    const params = new HttpParams({
        fromString: 'q[city_cont]=' + this._search
        });
    this._http.get(url, { headers: httpHeaders, params: params})
      .subscribe(res => {
        this._result = res;
      });
  }

  doSearchHttpParams2() {
    const url: string = 'https://trailapi-trailapi.p.mashape.com';
    const mashapeKey = 'OxWYjpdztcmsheZU9AWLNQcE9g9wp1qdRkFjsneaEp2Yf68nYH';
    const httpHeaders: HttpHeaders = 
      new HttpHeaders(
      {
        'Content-Type': 'application/json',
        'X-Mashape-Key': mashapeKey
      });
    const params = new HttpParams().set('q[city_cont]', this._search);
    this._http.get(url, { headers: httpHeaders, params: params})
      .subscribe(res => {
        this._result = res;
      });
  }

}
