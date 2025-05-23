package lk.ijse.logs.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ------------------------------------------------
 * Author: Sherul Fdo
 * GitHub: https://github.com/sherulfernando2000
 * Created: 5/21/2025 9:17 AM
 * Project: logs
 * ------------------------------------------------
 */

@RestController
public class LogController {

    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    public String logMessage() {
        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.warn("Warning log message");
        logger.error("Error log message");

        try {
            String notNumber = "hello";
            int number = Integer.parseInt(notNumber);

        }catch(NumberFormatException e) {
            e.getMessage();
            logger.error("Number format errror: {}", e.getMessage());   // e.getmessage prints inside the {}
        }






        return "This is sample end poinet for test log management Log data";
    }

}
