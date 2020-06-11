package com.mulecart.inventory.service;

import java.util.List;

import com.mulecart.inventory.entity.Inventory;

public interface InventoryService {
	
	public List<Inventory> getAllInventory();
	
	public boolean validateProduct(String sku);

}
