import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class SpecialityService {

  constructor(private httpService : HttpService ) {

  }

  setSpeciality(speciality : any) {
   return this.httpService.post({endpoint : '/api/speciality',data : speciality});
  }

  updateSpeciality(speciality : any) {
    return this.httpService.put({endpoint : '/api/speciality/create',data : speciality});
  }

  getSpeciality() {
   return this.httpService.get("/api/speciality/show");
  }

  deleteSpeciality(id : string) {
    return this.httpService.delete(`/api/speciality ${id}`);
  }

  // getCommune() {
  //   return this.httpService.get('communes');
  // }



}
