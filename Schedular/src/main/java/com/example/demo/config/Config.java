package com.example.demo.config;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling //to enable the schedule
public class Config 
{
	
	@Scheduled(fixedDelay = 1000)//1sec time
	public void ScheduleFixedDelayTask()
	{
//		System.out.println("vennela");
//		System.out.println(
//			      "Fixed rate task - " + System.currentTimeMillis() / 1000);
	//	getting Date and Time using now() method.
		//it is returns immutable and thread safe instance. 
		
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		
//		LocalTime time = LocalTime.now();
//		System.out.println(time);
//		
		LocalDateTime instance =  LocalDateTime.now();
		System.out.println(instance);
		
	}
}