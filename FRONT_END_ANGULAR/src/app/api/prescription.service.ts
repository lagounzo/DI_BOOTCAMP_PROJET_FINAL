import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class PrescriptionService {

  constructor(private httpService : HttpService ) {

  }

  setPrescription(prescription : any) {
   return this.httpService.post({endpoint : '/api/prescription/create',data : prescription});
  }

  updatePrescription(prescription : any) {
    return this.httpService.put({endpoint : '/api/prescription/update',data : prescription});
  }

  getPrescription() {
   return this.httpService.get("/api/prescription/show");
  }

  deletePrescription(id : string) {
    return this.httpService.delete(`/api/prescription ${id}`);
  }


}
