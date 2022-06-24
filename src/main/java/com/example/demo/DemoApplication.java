package com.example.demo;

import com.example.demo.repository.JdbcRepository;
import com.example.demo.repository.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//		JdbcRepository jdbcRepository = new JdbcRepository();
//		jdbcRepository.findUsers();
		SpringApplication.run(DemoApplication.class, args);
//		System.out.println(new Gson().toJson(userRepository.findAll()));

	}

}
