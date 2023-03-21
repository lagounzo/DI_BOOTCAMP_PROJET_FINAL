export class Patient{

  constructor(
    public first_name: string = "",
    public last_name: string = "",
    public email: string = "",
    public gender: string = "",
    public address: string = "",
    public contact : string = "",
    public assurance_maladie : string = "",
    public commune: string = "",
    public birthday : string = "",
    // public password : string = ""
  ) {}
}
