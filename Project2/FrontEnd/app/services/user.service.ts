import { Injectable } from '@angular/core';
import { NewUser } from 'src/app/models/user';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ConfigAPI } from 'src/app/models/configAPI';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(
    private http: HttpClient
  ) { }

  private userUrl = 'http://localhost:8074/MovieFanatics/user/new';
  private userUrl1 = 'http://localhost:8074/MovieFanatics/user';

  public createUser(user) {

    return this.http.post<NewUser>(ConfigAPI.spring_url + 'user/new/', + user);
  }

  findById(id: number) {
    return this.http.get<NewUser>(ConfigAPI.spring_url + 'user/' + id);
  }
}
