package com.rms.AndhraSpices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rms.AndhraSpices.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	@Query("SELECT count(item) from Item item")
	public Long getCountOfItem();
	
	@Query("SELECT max(item.itemId) from Item item ")
	public int getMaxOfItemId();
	
	

}
