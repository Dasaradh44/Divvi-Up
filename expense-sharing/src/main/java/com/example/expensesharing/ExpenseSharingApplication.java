package com.example.expensesharing;



//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.expensesharing.entity.Group;
//import com.example.expensesharing.repository.GroupRepository;

@SpringBootApplication
public class ExpenseSharingApplication {
    //private GroupRepository groupRepository;
	public static void main(String[] args) {
		SpringApplication.run(ExpenseSharingApplication.class, args);
		System.out.println("Server started successfully.....!");
	}
	
}
