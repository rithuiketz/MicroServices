package com.mulecart.integration;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mulecart.inventory.entity.Inventory;
import com.mulecart.inventory.repository.InventoryRepo;

@RunWith(SpringRunner.class)
@DataMongoTest
public class InventoryCrudTest {

	@Autowired
	private InventoryRepo inventoryRepo;

	public InventoryCrudTest() {
		// TODO Auto-generated constructor stub
	}

	//@Test
	//@Order(1)
	public void create() {
		
		System.out.println("#############Create###################");
		Inventory inventory = new Inventory();
		inventory.setName("TSHIRT");
		inventory.setBrand("USPOLO");
		inventory.setColor("RED");
		inventory.setPrice(500d);
		inventory.setSku("23e-4566-333");
		inventory.setCreatedTime(new Date());
		inventory.setUpdatedTime(new Date());

		inventoryRepo.save(inventory);

		Inventory inventory2 = new Inventory();
		inventory2.setName("JACKET");
		inventory2.setBrand("VANHEUSSAIN");
		inventory2.setColor("RED");
		inventory2.setPrice(500d);
		inventory2.setSku("23e-4566-333");
		inventory2.setCreatedTime(new Date());
		inventory2.setUpdatedTime(new Date());

		inventoryRepo.save(inventory2);
	}

	//@Test
	//@Order(2)
	public void listAll() {
		System.out.println("#############LIST###################");
		List<Inventory> savedEntities = inventoryRepo.findAllActiveInventory();
		assertTrue(savedEntities != null && savedEntities.size() > 0);
	}

	//@Test
	//@Order(3)
	public void update() {
		System.out.println("#############Update###################");
		List<Inventory> savedEntities = inventoryRepo.findAllActiveInventory();
		Inventory inv = savedEntities.get(0);
		inv.setColor("yeellow");
		inventoryRepo.save(inv);
		savedEntities = inventoryRepo.findAllActiveInventory();
		System.out.println(savedEntities);
	}

	@Test
	@Order(4)
	public void delete() {
		System.out.println("############# Before Delete###################");
		List<Inventory> savedEntities = inventoryRepo.findAllActiveInventory();
		Inventory inv = savedEntities.get(0);
		inv.setDeletedTime(new Date());
		inventoryRepo.save(inv);
		System.out.println(savedEntities);
		System.out.println("############# After Delete###################");
		savedEntities = inventoryRepo.findAllActiveInventory();
		System.out.println(savedEntities);
	}

}
