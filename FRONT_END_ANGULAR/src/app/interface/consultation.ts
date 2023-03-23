export class Consultation{
  constructor(
    public id_consultation: string = "",
    public id_profil: string ="",
    public id_hopital: any = "",
    public id_medecin: any = "",
    public id_speciality: any = "",
    public reason_consultation: string = "",
    public symptoms : string= "",
    public prescribed_treatment:string ="",
    public consultation_date:string=""

  ){}
}