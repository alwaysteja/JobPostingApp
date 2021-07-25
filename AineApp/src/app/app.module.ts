import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { JobListComponent } from './job-list/job-list.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { PostJobComponent } from './post-job/post-job.component';
import { FormsModule } from '@angular/forms';
import { ApplyJobComponent } from './apply-job/apply-job.component';
import { AppliedComponent } from './applied/applied.component';


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    JobListComponent,
    PostJobComponent,
    ApplyJobComponent,
    AppliedComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
