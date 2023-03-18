import { Injectable } from "@angular/core";
import { HttpService } from "./api.service";


@Injectable({
  providedIn : 'root'
})
export class ProfessionService {

  constructor(private httpService : HttpService ) {

  }

  setProfession(profession : any) {
   return this.httpService.post({endpoint : 'fonctions',data : profession});
  }

  updateProfession(profession : any) {
    return this.httpService.put({endpoint : 'fonctions',data : profession});
  }

  getProfession() {
   return this.httpService.get("fonctions");
  }

  deleteProfession(id : string) {
    return this.httpService.delete(`fonctions ${id}`);
  }

  // getCommune() {
  //   return this.httpService.get('communes');
  // }

}
