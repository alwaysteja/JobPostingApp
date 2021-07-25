package com.example.Candidates;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class CandiServ {
     @Autowired
    CandiRepo candiRepo;

    public void saveOrUpdate(Candidates can){
        candiRepo.save(can);
      }

      public Optional<Candidates> getById(int i){
          return candiRepo.findById(i);
      }
    

}
