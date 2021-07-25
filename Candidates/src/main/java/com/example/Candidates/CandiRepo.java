package com.example.Candidates;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface CandiRepo extends JpaRepository<Candidates,Integer> {

    
    @Query(value ="SELECT * FROM teja.candidates WHERE Job_id=:Job_id", nativeQuery = true)
    List<Candidates> findListWithsameId(@Param("Job_id") int Job_id);
}
