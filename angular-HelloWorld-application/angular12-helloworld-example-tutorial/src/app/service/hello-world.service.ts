
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Message } from '../model/message';


@Injectable({
  providedIn: 'root'
})
export class HelloWorldService {
  constructor(private http: HttpClient) {
  }
  executeHelloWorldService() {
      return this.http.get<Message>('http://localhost:8080/greeting');
  }
}
