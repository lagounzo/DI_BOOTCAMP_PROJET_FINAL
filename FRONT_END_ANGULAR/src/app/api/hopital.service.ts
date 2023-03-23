import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class HopitalService {

  constructor(private httpService : HttpService ) {

  }

  setHopital(hopital : any) {
   return this.httpService.post({endpoint : '/api/hopital',data : hopital});
  }

  updateHopital(hopital : any) {
    return this.httpService.put({endpoint : '/api/hopital/create',data : hopital});
  }

  getHopital() {
   return this.httpService.get("/api/hopital/show");
  }

  deleteHopital(id : string) {
    return this.httpService.delete(`/api/hopital ${id}`);
  }

 



}
