import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})

export class PatientService {

  //constructor

  constructor(private httpInfo : HttpService ) {}

  setPatient(patient : any){
    return this.httpInfo.post({endpoint : 'patients',data : patient});

  }

  updatePatient(patient : any) {
    return this.httpInfo.put({endpoint : 'patients',data : patient});
  }

  getRegister() {
    return this.httpInfo.get("patients");
   }

   deleteRegister(id : string) {
    return this.httpInfo.delete(`patients ${id}`);
  }
}
