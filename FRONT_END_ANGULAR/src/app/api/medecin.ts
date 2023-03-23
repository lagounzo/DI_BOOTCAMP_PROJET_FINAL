import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class MedecinService {

  constructor(private httpService : HttpService ) {

  }

  setMedecin(medecin : any) {
   return this.httpService.post({endpoint : '/api/medecin',data : medecin});
  }

  updateMedecin(medecin : any) {
    return this.httpService.put({endpoint : '/api/medecin/create',data : medecin});
  }

  getMedecin() {
   return this.httpService.get("/api/medecin/show");
  }

  deleteMedecin(id : string) {
    return this.httpService.delete(`/api/medecin ${id}`);
  }


}