import { Injectable } from "@angular/core";
import { Register } from "../interface/register";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class LoginService {

  constructor(private httpService : HttpService ) {

  }

  setLogin(login : any) {
   return this.httpService.post({endpoint : 'commtUsers/login',data : login});
  }
  updateLogin(login : any) {
    return this.httpService.put({endpoint : 'commtUsers/login',data : login});
  }

  getLogin() {
   return this.httpService.get('commtUsers/login');
  }

  deleteLogin(id : string) {
    return this.httpService.delete(`commtUsers/login ${id}`);
  }



}
