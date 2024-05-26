package com.mostDev.contentCalendar;

import com.mostDev.contentCalendar.model.Content;
import com.mostDev.contentCalendar.model.Status;
import com.mostDev.contentCalendar.model.Type;
import com.mostDev.contentCalendar.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);

	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			Content content = new Content (
					null,
					"Naurto",
					"anime based off the ninja world",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
			        "");

			repository.save(content);
		};
	}

}
