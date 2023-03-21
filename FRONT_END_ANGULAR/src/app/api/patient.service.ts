import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})

export class PatientService {

  //constructor

  constructor(private httpInfo : HttpService ) {}

  setPatient(profil : any){
    return this.httpInfo.post({endpoint : 'api/profil',data : profil});

  }

  updatePatient(profil : any) {
    return this.httpInfo.put({endpoint : 'api/profil',data : profil});
  }

  getRegister() {
    return this.httpInfo.get("api/profil");
   }

   deleteRegister(id : string) {
    return this.httpInfo.delete(`api/profil ${id}`);
  }
}
