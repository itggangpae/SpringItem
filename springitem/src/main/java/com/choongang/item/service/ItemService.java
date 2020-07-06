package com.choongang.item.service;

import java.util.List;

import com.choongang.item.domain.Item;

public interface ItemService {
	public List<Item> getAll(); 
	public Item getItem(Integer itemid);
}
