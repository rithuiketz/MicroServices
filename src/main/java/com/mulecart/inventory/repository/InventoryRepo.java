package com.mulecart.inventory.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mulecart.inventory.entity.Inventory;

@Repository
public interface InventoryRepo extends MongoRepository<Inventory, String>
{
	@Query("{deletedTime : null}")
	public List<Inventory> findAllActiveInventory();
	
	@Query("{'sku' : ?0, 'deletedTime' : null}")
	public List<Inventory> findActiveInventoryBYSku(String sku);
	
}
