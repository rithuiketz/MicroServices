package com.mulecart.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.mulecart.gateway.filters.RequestFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@ComponentScan(basePackageClasses=RequestFilter.class)
public class ApplicationGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationGateWayApplication.class, args);
	}

}
