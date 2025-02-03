import { Patient } from "./patient";

export interface Intervention {
  code: number ;
  date_intervention:Date;
  type:string;
  String:number
  filiere:Patient
}
