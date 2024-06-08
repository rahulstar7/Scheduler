package com.scheduler.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.scheduler.dao.User;
import com.scheduler.model.Users;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private User dao;

	@Scheduled(fixedRate = 5000)
	public void saveUser() {
		Users users = new Users();
		users.setName("user" + new Random().nextInt(12352));
		dao.save(users);

		System.out.println("Add Service calling" + new Date().toString());

	}

	@Scheduled(cron = "0/15 * * * * * ")
	public void getAllUser() {
		List<Users> allUser = dao.findAll();
		System.out.println("get Service calling" + new Date().toString());

		System.out.println("No of records fetched" + allUser.size());

		logger.info("Users :{}", allUser);

	}

}
