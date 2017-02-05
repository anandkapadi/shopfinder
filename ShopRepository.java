package com.anand.retail;

import java.util.ArrayList;
import java.util.List;

public class ShopRepository {
	
	private List<Shop> shops;
	
	public ShopRepository(){
		this.shops = new ArrayList<Shop>();
		System.out.println("Shops repository initialized...");
	}

	public void add(Shop shop)
	{
		this.shops.add(shop);
	}
	
	public List<Shop> getAll(){
		return this.shops;
	}
}
