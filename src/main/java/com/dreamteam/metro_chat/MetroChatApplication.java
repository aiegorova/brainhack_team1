package com.dreamteam.metro_chat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetroChatApplication {

	private static final Logger logger = LogManager.getLogger(MetroChatApplication.class);

	public static void main(String[] args) {
		setDefaultExceptionHandler();
		SpringApplication.run(MetroChatApplication.class, args);
	}

	private static void setDefaultExceptionHandler() {
		Thread.setDefaultUncaughtExceptionHandler(
				(thread, t) -> {
					logger.error("Uncaught exception in thread {}", thread.getName(), t);
					System.err.println("Uncaught exception in thread " + thread.getName()
							+ " " + t.getClass().getName()
							+ " " + t.getMessage());
					t.printStackTrace(System.err);
				});
	}

}
