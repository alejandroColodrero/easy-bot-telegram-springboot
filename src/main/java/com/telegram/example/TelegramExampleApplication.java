package com.telegram.example;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegramExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelegramExampleApplication.class, args);
	}

    @PostConstruct
    public void launcher() { 
    	System.out.println("Launching Easy Telegram Bot");
    }
	
}
