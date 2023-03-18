import { Injectable } from "@angular/core";
import { Register } from "../interface/register";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class HopitalService {

  constructor(private httpService : HttpService ) {

  }

  setHopital(hopital : any) {
   return this.httpService.post({endpoint : 'hopitals',data : hopital});
  }

  updateHopital(hopital : any) {
    return this.httpService.put({endpoint : 'hopitals',data : hopital});
  }

  getHopital() {
   return this.httpService.get("hopitals");
  }

  deleteHopital(id : string) {
    return this.httpService.delete(`hopitals ${id}`);
  }

  // getCommune() {
  //   return this.httpService.get('communes');
  // }



}
