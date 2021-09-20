package com.rms.AndhraSpices.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rms.AndhraSpices.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {
    
	@Query("SELECT count(category) from Category category")
	public Long getCountOfCategory();
	
	@Query("SELECT max(category.categoryId) from Category category")
	public int getMaxOfCategoryId();
	
	
}
