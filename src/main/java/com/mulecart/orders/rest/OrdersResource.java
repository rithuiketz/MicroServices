package com.mulecart.orders.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mulecart.orders.feign.InventoryServiceClient;

@RestController
@RequestMapping(value = "/api/orders")
public class OrdersResource {

	@Autowired
	private InventoryServiceClient inventoryServiceClient;

	@PostMapping(value = "/validateInventory")
	public HttpStatus validateInvemtory(@RequestParam(name = "skuId") String skuId) {
	
		return inventoryServiceClient.validateSKU(skuId);

	}

}
