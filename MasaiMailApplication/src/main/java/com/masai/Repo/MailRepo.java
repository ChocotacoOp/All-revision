package com.masai.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.Mail;

public interface MailRepo extends JpaRepository<Mail, Integer>{

}
