package com.example.Aine;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobsService {
   
    @Autowired
    JobsRepo jobsRepo;

    @Autowired
    CandiRepo candiRepo;

    public ArrayList<Jobs> getAll(){
        ArrayList<Jobs> jobs=new ArrayList<>();
        for(Jobs j:jobsRepo.findAll()){
        jobs.add(j);
        }

        return jobs;
    }
    public void saveOrUpdate(Jobs jobs){
        jobsRepo.save(jobs);
      }
public ArrayList<Candidates> getCandiById(int Id){
       return candiRepo.findListWithsameId(Id);
}
    
}
