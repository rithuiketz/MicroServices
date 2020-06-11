package com.mulecart.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

import com.mulecart.orders.feign.InventoryServiceClient;
import com.mulecart.orders.rest.OrdersResource;

@SpringBootApplication
@ComponentScan(basePackageClasses={OrdersResource.class})
@EnableFeignClients(basePackageClasses=InventoryServiceClient.class)
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
