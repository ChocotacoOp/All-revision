package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import com.masai.model.FIR;

public interface FIRRepo extends JpaRepository<FIR, Integer>{

}
