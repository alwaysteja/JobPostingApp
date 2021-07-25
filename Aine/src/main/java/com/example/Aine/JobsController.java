package com.example.Aine;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class JobsController {

    @Autowired
    JobsService jobsService;
   

   @GetMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
    @GetMapping("/jobs")
    public List<Jobs> getAllJobs(){
        return jobsService.getAll();
    }
    @PostMapping("/job")
    public int saveOrUpdate(@RequestBody Jobs jobs){
    jobsService.saveOrUpdate(jobs);
    return jobs.getJobId();
    }

    
}
