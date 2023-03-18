export class Patient{

  constructor(
    public first_name: string = "",
    public last_name: string = "",
    public email: string = "",
    public sexe: string = "",
    public address: string = "",
    public assurance_maladie : string = "",
    public commune: string = "",
    public profession : string = ""
  ) {}
}
