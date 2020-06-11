package mulecart.inventory.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mulecart.inventory.service.InventoryService;

@RestController
@RequestMapping(value = "/api/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;

	@PostMapping(value="/validateSku")
	public HttpStatus validateSkuId(@RequestParam(name="skuId") String skuId) 
	{
		return inventoryService.validateProduct(skuId) == true ? HttpStatus.ACCEPTED
				: HttpStatus.NOT_ACCEPTABLE;
	}

}
