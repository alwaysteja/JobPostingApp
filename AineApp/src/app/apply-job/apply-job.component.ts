import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Candidates } from '../candidates';
import { CandidatesService } from '../candidates.service';

@Component({
  selector: 'app-apply-job',
  templateUrl: './apply-job.component.html',
  styleUrls: ['./apply-job.component.css']
})
export class ApplyJobComponent implements OnInit {
  can:Candidates=new Candidates();
  constructor(private canService:CandidatesService,private router:Router) { }
  

  ngOnInit(): void {
  }
  applysave(){
    this.canService.Apply(this.can).subscribe(data =>
      {console.log(data);},
      error => console.log(error));
      this.goTOJobs();
  }
  goTOJobs(){
    this.router.navigate(['/jobs']);
  }
  onSubmit(){
     console.log(this.can);
     this.applysave();
  }

}
