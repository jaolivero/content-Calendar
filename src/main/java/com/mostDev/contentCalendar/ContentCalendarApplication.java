package com.mostDev.contentCalendar;

import com.mostDev.contentCalendar.config.ContentCalendarProperties;
import com.mostDev.contentCalendar.model.Content;
import com.mostDev.contentCalendar.model.Status;
import com.mostDev.contentCalendar.model.Type;
import com.mostDev.contentCalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import java.time.LocalDateTime;

@SpringBootApplication
@EnableConfigurationProperties(ContentCalendarProperties.class)
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
			        ""
			);




			repository.save(content);

		};
	}

}
