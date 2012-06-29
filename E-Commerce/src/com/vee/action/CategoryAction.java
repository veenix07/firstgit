package com.vee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vee.model.Category;
import com.vee.services.CategoryService;

public class CategoryAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1785728061958588904L;
	private String category_name;
	private CategoryService categoryService;

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String category_add_form() {
		return SUCCESS;
	}

	public String category_add() {
		Category cat = new Category();
		cat.setCategoryName(category_name);
		categoryService.save(cat);
		category_name = "";
		return SUCCESS;
	}
}
