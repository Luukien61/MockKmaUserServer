package com.example.mockkmastudentserver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MockKmaStudentServerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MockKmaStudentServerApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
