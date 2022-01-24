package spring.learn.spring.learn.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cognizant")
public class SpringLearnMyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnMyApplication.class, args);
	}

}
