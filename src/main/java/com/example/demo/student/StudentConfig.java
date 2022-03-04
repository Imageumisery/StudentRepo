package com.example.demo.student;

import static java.time.Month.APRIL;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner cammandLineRuneer(StudentRepository repository) {
		return args -> {
			Student Shakhzod = new Student ( 
					"Shakhzod", 
					"imageumisery@gmail.com", 
					LocalDate.of(1998, APRIL, 2));
			Student Bobur = new Student (
					"Bobur", 
					"Dasdf230@gmail.com", 
					LocalDate.of(1997, APRIL, 18));
			repository.saveAll(
					List.of(Shakhzod, Bobur)
			);
		};
	}

}
