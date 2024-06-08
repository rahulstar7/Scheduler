package com.scheduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scheduler.model.Users;

public interface User extends JpaRepository<Users, Integer>{

}
