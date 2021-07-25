package com.example.Aine;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepo extends CrudRepository<Jobs,Integer> {
    
}
