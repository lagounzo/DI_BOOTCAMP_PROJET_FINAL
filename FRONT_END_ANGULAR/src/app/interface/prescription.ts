import { Consultation } from "./consultation";

export class Prescription{
  constructor(
    public id_prescription:string="",
    public prescribed_medication: string = "",
    public dosage : string ="1 par jour",
    public duration_treatment : string = "",
    public prescription_date : string = "",
    public consultation:Consultation = new Consultation(),
    public  id_consultation: string="",
    public  id_profil:number=0,
    public  id_medecin:number=0,
    public  id_hopital:number=0,
  ){}
}
