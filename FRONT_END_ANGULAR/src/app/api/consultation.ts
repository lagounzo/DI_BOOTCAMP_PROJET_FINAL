import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class ConsultationService {

  constructor(private httpService : HttpService ) {

  }

  setConsultation(consultation : any) {
   return this.httpService.post({endpoint : '/api/consultation/create',data : consultation});
  }

  updateConsultation(consultation : any) {
    return this.httpService.put({endpoint : '/api/consultation/update',data : consultation});
  }

  getConsultation() {
   return this.httpService.get("/api/consultation/show");
  }

  deleteConsultation(id : string) {
    return this.httpService.delete(`/api/consultation ${id}`);
  }


}