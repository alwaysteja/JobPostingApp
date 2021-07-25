package com.example.Candidates;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CandiRepo extends CrudRepository<Candidates,Integer> {
    
}
