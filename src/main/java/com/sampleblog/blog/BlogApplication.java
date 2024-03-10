package com.sampleblog.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BlogApplication {
	    
	// @Autowired
    // private DataRetriever dataRetriever;

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
	// @PostConstruct
    // public void init() {
    //     dataRetriever.printAllBlogs();
    // }

}
