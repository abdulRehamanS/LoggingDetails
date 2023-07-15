package In.Abdul.Logging.Practise.Repo;

import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class userRepo {

    Logger logger = (Logger) LoggerFactory.getLogger(userRepo.class);
    public String getName(Integer id) {
        String name = null;
        logger.info("getName()-- started here");
        if (id == 100) {
            name = "abdul";
        } else {
            name = "rehaman";
        }
        logger.info("getName() has ended here");
        return name;
    }
}
