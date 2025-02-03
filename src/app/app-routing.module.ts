import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListComponent } from './components/list/list.component';
import { CreateComponent } from './components/create/create.component';

const routes: Routes = [
  {path:"list",component:ListComponent},
  {path:"add",component:CreateComponent},

  {path:'',redirectTo:"list",pathMatch:'full'},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
