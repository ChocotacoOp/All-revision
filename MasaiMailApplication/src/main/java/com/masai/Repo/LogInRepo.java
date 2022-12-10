package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.LogInRegister;

public interface LogInRepo extends JpaRepository<LogInRegister, Integer>{

}
