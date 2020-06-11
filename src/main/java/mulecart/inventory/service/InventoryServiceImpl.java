package mulecart.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulecart.inventory.entity.Inventory;
import com.mulecart.inventory.repository.InventoryRepo;
import com.mulecart.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepo inventoryRepo;

	@Override
	public boolean validateProduct(String sku) {
		
		List<Inventory> inventory =  inventoryRepo.findActiveInventoryBYSku(sku);
		if(inventory == null || inventory.size() ==0)
			return false;
		else
			return true;
		
	}

	@Override
	public List<Inventory> getAllInventory() {
		// TODO Auto-generated method stub
		return inventoryRepo.findAllActiveInventory();
	}
	

}
