package com.example.Candidates;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CandiController {
    @Autowired
    CandiServ canSer;

   @GetMapping("/hello")
    public String sayHi() {
        return "Hi";
    }
    
    @PostMapping("/candidates")
    public void saveOrUpdate(@RequestBody Candidates can){
    canSer.saveOrUpdate(can);

    }
    @GetMapping("/candidates/{id}")
    public ResponseEntity<Candidates> getAllByID(@PathVariable("id") int id) {
      Optional<Candidates> candi = canSer.getById(id);
      if(candi.isPresent()){
      return new ResponseEntity<Candidates>(candi.get(),HttpStatus.OK);
      }
      else{
        return new ResponseEntity<Candidates>(HttpStatus.NOT_FOUND); 
      }
    }

    
}
