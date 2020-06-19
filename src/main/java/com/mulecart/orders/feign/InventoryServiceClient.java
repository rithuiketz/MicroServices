package com.mulecart.orders.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="gateway")
public interface InventoryServiceClient 
{
	@RequestMapping(method=RequestMethod.POST,path="/inventory/api/inventory/validateSku")
	HttpStatus validateSKU(@RequestParam(name = "skuId") String skuId);
		
}
