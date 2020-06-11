package com.mulecart.service.test;

import static org.junit.Assert.*;

import java.util.List;

import mulecart.inventory.service.InventoryServiceImpl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.mulecart.inventory.InventoryServiceApplication;
import com.mulecart.inventory.service.InventoryService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=InventoryServiceApplication.class)
public class ServiceTest {

	@Autowired
	private InventoryService inventoryService;

	@Test
	public void test() 
	{
		Assert.assertEquals(true, inventoryService.validateProduct("23e-4566-333"));
		
	}

}
