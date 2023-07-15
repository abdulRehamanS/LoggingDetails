package In.Abdul.Logging.Practise;

import In.Abdul.Logging.Practise.Repo.userRepo;
import In.Abdul.Logging.Practise.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingPractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingPractiseApplication.class, args);



		// calling methods from here

		userRepo us = new userRepo();
		us.getName(100);

		// calling other methods

		UserService ss = new UserService();
		ss.greet();
		ss.welcome();
	}



}
