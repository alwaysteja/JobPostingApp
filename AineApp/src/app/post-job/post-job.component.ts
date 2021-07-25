import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Jobs } from '../jobs';
import { JobsService } from '../jobs.service';

@Component({
  selector: 'app-post-job',
  templateUrl: './post-job.component.html',
  styleUrls: ['./post-job.component.css']
})
export class PostJobComponent implements OnInit {
 
  job:Jobs=new Jobs();
  constructor(private jobsService:JobsService,private router:Router) { }

  ngOnInit(): void {
  }
  saveJob(){
    this.jobsService.createJob(this.job).subscribe(data =>
      {console.log(data);},
      error => console.log(error));
      this.goTOJobs();
  }
  goTOJobs(){
    this.router.navigate(['/jobs']);
  }
  onSubmit(){
     console.log(this.job);
     this.saveJob();
  }

}
