package In.Abdul.Logging.Practise.Service;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

//@Service
public class UserService {


    Logger logger = (Logger) LoggerFactory.getLogger(UserService.class);

    public String greet() {
        logger.info("greet() has started here...");
        String msg = "Good Morning Boos";

        logger.info("greet() has ended here...");
        return msg;
    }

    public String welcome() {
        logger.info("welcome() has started here...");
        String msg = "Good Evening Boos";

        logger.info("welcome() has ended here...");
        return msg;
    }
}
