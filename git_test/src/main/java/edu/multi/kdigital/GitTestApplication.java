package edu.multi.kdigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
		System.out.println("for github push");
		System.out.println("This line has been on Github");
	}

}
