package com.deployment.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple Spring REST controller that returns text content
 * when accessed through a web browser.
 */
@RestController
public class Message {

    /**
     * Handles GET requests to the root path ("/") and returns
     * a simple text message that will display in the browser.
     *
     * @return String containing the text to display
     */
    @GetMapping("/")
    public String displayText() {
        return "Hello! This is a text message from the Spring Controller.";  //
    }

    /**
     * Handles GET requests to the "/welcome" path and returns
     * a more detailed welcome message.
     *
     * @return String containing a welcome message
     */
    @GetMapping("/welcome")
    public String welcomeMessage() {
        return "Welcome to my Spring Boot application! This text is being served by a Spring Controller.";
    }
}
