import { Component, OnInit, ViewChild } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.css']
})
export class ArticlesComponent implements OnInit {
  public static apiUrl = "http://jsonplaceholder.typicode.com/posts";
  _posts = [];
  _post = {};
  
  @ViewChild('modal') _myModal: any;

  constructor(private _http: HttpClient) { }

  ngOnInit() {
    this._http.get<any>(ArticlesComponent.apiUrl).subscribe(res => {
      this._posts = res;
    })
  }

  showPost(postId: number) {
    this._http.get<any>(`${ArticlesComponent.apiUrl}/${postId}`).subscribe(res => {
      this._post = res;
      this._myModal.nativeElement.style.display = 'block';
    })
  }

  closeModal() {
    this._myModal.nativeElement.style.display = 'none';
  }

}
