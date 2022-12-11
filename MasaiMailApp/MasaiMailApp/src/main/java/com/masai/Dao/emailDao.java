package com.masai.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.email;

@Repository
public interface emailDao extends JpaRepository<email, Integer>{

}
