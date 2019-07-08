package com.example.website;

import com.example.website.model.DataProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
        for (int i = 0; i < DataProvider.movies.size(); i++) {
        }
    }

}
