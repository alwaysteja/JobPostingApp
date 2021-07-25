package com.example.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CandiServ {
     @Autowired
    CandiRepo candiRepo;

    public void saveOrUpdate(Candidates can){
        candiRepo.save(can);
      }
 
    public List<Candidates> findListWithsameId(int i){
        return candiRepo.findListWithsameId(i);
    }
      
    

}
