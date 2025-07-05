package org.cloudfoundry.samples.music.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/errors")
public class ErrorController {
    private static final Logger logger = LoggerFactory.getLogger(ErrorController.class);

    @GetMapping("/kill")
    public void kill() {
        logger.info("Forcing application exit");
        System.exit(1);
    }

    @GetMapping("/throw")
    public void throwException() {
        logger.info("Forcing an exception to be thrown");
        throw new NullPointerException("Forcing an exception to be thrown");
    }
}
