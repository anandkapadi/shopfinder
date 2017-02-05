package com.anand.retail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/store")
public class ShopInfoService {
	
	@Autowired
	ShopRepository repo;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Shop> getAll(){
		return repo.getAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addShop(@RequestBody Shop shop){
		 repo.add(shop);
	}

}
