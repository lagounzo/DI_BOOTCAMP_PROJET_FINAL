import { Injectable } from "@angular/core";
import { Register } from "../interface/register";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class FunctionService {

  constructor(private httpService : HttpService ) {

  }

  setRegister(register : any) {
   return this.httpService.post({endpoint : 'commtUsers',data : register});
  }

  updateRegister(register : Register) {
    return this.httpService.put({endpoint : 'commtUsers',data : register});
  }

  getRegister() {
   return this.httpService.get("commtUsers");
  }

  deleteRegister(id : string) {
    return this.httpService.delete(`commtUsers ${id}`);
  }



}
