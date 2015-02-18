package lastProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class lastProjectApp {

	public static void main(String[] args) {

		SpringApplication.run(lastProjectApp.class, args);
	}
}
