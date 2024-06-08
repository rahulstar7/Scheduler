package com.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulerApplication.class, args);
	}
   
	
	//After Task
	 public String afternoon()
	 {
		 
		 return "taskCOmpleted";
	 }

	
	//First Task
	public String demo()
	{
		return "Welcome";
	}
	
}
