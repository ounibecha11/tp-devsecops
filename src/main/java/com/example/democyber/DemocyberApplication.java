
package com.example.democyber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemocyberApplication {
    //private static final String GITHUB_TOKEN = "ghp_123456789abcdef123456789abcdef1234"

    public static void main(String[] args) {
        SpringApplication.run(DemocyberApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Democyber 123 2026!";
    }
}
