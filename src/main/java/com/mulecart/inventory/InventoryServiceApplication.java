package com.mulecart.inventory;

import mulecart.inventory.rest.InventoryController;
import mulecart.inventory.service.InventoryServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mulecart.inventory.repository.InventoryRepo;
import com.mulecart.inventory.service.InventoryService;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses=InventoryRepo.class)
@EntityScan(basePackages={"com.mulecart.inventory.entity"})
@ComponentScan(basePackageClasses={InventoryServiceImpl.class,InventoryController.class})
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

}
