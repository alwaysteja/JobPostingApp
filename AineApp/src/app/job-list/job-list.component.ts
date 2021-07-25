import { Component, OnInit } from '@angular/core';
import { Jobs } from '../jobs';
import { JobsService } from '../jobs.service';

@Component({
  selector: 'app-job-list',
  templateUrl: './job-list.component.html',
  styleUrls: ['./job-list.component.css']
})
export class JobListComponent implements OnInit {
 
  job:Jobs[];

  constructor(private jobSercices:JobsService) {}
 ngOnInit(): void {
this.getAllJobs();
  }
  private getAllJobs(){
    this.jobSercices.getJobsList().subscribe(data => {
        this.job = data;});
  }
 

}
