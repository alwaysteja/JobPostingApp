import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppliedComponent } from './applied/applied.component';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { JobListComponent } from './job-list/job-list.component';
import { PostJobComponent } from './post-job/post-job.component';

const routes: Routes = [
  {path:'jobs',component:JobListComponent},
  {path:'create-job',component:PostJobComponent},
  {path:'apply', component:ApplyJobComponent},
  {path:'applied',component:AppliedComponent},
  {path:'',redirectTo:'jobs',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
