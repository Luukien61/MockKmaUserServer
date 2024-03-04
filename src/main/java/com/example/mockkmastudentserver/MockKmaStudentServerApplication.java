package com.example.mockkmastudentserver;

import com.example.mockkmastudentserver.util.NetworkUtil;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MockKmaStudentServerApplication {

    public static void main(String[] args) {
        final String IP_ADDRESS = NetworkUtil.getIPv4Address();
        //SpringApplication application = new SpringApplication(MockKmaStudentServerApplication.class);
        var builder = new SpringApplicationBuilder(MockKmaStudentServerApplication.class);
        builder.properties("server.address", IP_ADDRESS);
        builder.bannerMode(Banner.Mode.OFF);
        builder.application().run(args);
    }
}
