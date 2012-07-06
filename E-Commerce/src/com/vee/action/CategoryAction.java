package com.vee.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vee.model.Category;
import com.vee.model.Image;
import com.vee.model.Product;
import com.vee.services.GenericService;
import com.vee.services.ServiceBundle;

public class CategoryAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1785728061958588904L;
	private String category_name;
	private GenericService<Product> productService;
	private GenericService<Category> categoryService;
	private List<Category> listCategory;
	private String catPost;
	private int cat_id;

	public CategoryAction(ServiceBundle serviceBundle) {
		// TODO Auto-generated constructor stub
		productService = serviceBundle.getProductService();
		categoryService = serviceBundle.getCategoryService();
		cat_id = 0;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public String category_add_form() {
		return SUCCESS;
	}

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	public String getCatPost() {
		return catPost;
	}

	public void setCatPost(String catPost) {
		this.catPost = catPost;
	}

	public String getCategoryPost() {
		listCategory = categoryService.getList();
		if (cat_id == 0) {
			cat_id = listCategory.get(0).getId();
		}
		List<Product> products = productService.getListByColumn("category_id",
				cat_id);
		StringBuilder sb = new StringBuilder();
		sb.append("[spoiler=\"" + categoryService.getEntity(cat_id).getCategoryName()+ "\"]\n");
		for (Product product : products) {
			sb.append("\t[spoiler=\"Code : " + product.getProductCode()
					+ "\"]\n");
			sb.append("\t" + product.getProductDesc().replaceAll("<br/>", "\n") + "\n");
			sb.append("\tPrice : " + product.getProductPrice() + " IDR\n");
			sb.append("\t\t[spoiler=\"Picture\"]\n");
			for (Image img : product.getImages()) {
				sb.append("\t\t\t[img]" + img.getImg_url() + "[/img]\n");
			}
			sb.append("\t\t[/spoiler]\n");
			sb.append("\t[/spoiler]\n");
		}
		sb.append("[/spoiler]");
		catPost = sb.toString();
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
