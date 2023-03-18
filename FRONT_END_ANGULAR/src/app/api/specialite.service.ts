import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class SpecialiteService {

  constructor(private httpService : HttpService ) {

  }

  setSpecialite(specialite : any) {
   return this.httpService.post({endpoint : 'specialite',data : specialite});
  }

  updateSpecialite(specialite : any) {
    return this.httpService.put({endpoint : 'specialite',data : specialite});
  }

  getSpecialite() {
   return this.httpService.get("specialite");
  }

  deleteSpecialite(id : string) {
    return this.httpService.delete(`specialite ${id}`);
  }

  // getCommune() {
  //   return this.httpService.get('communes');
  // }



}
