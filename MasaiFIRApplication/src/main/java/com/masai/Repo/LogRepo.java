package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.LogInOut;

public interface LogRepo extends JpaRepository<LogInOut, Integer>{

}
