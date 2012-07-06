package com.vee.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vee.model.Category;
import com.vee.model.Image;
import com.vee.model.Product;
import com.vee.services.GenericService;
import com.vee.services.ServiceBundle;

public class ProductAction extends ActionSupport {
	/**
	 * 
	 */

	private static final long serialVersionUID = 6965077850339261446L;
	private GenericService<Product> productService;
	private GenericService<Image> imageService;
	private GenericService<Category> categoryService;
	private List<Product> listProduct;
	private List<Category> listCategory;
	private List<Image> listImages;
	private Product inputProduct;
	private Product detailProduct;
	private String inputImages;
	private int id_del;
	private int categoryId;
	private int prod_id;
	private int cat_id;

	public ProductAction(ServiceBundle serviceBundle) {
		// TODO Auto-generated constructor stub
		productService = serviceBundle.getProductService();
		imageService = serviceBundle.getImageService();
		categoryService = serviceBundle.getCategoryService();
	}

	public int getCat_id() {
		return cat_id;
	}

	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public List<Category> getListCategory() {
		return listCategory;
	}

	public void setListCategory(List<Category> listCategory) {
		this.listCategory = listCategory;
	}

	public int getId_del() {
		return id_del;
	}

	public void setId_del(int id_del) {
		this.id_del = id_del;
	}

	public Product getInputProduct() {
		return inputProduct;
	}

	public String getInputImages() {
		return inputImages;
	}

	public void setInputImages(String inputImages) {
		this.inputImages = inputImages;
	}

	public void setInputProduct(Product inputProduct) {
		this.inputProduct = inputProduct;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}

	public List<Image> getListImages() {
		return listImages;
	}

	public void setListImages(List<Image> listImage) {
		this.listImages = listImage;
	}

	public Product getDetailProduct() {
		return detailProduct;
	}

	public void setDetailProduct(Product detailProduct) {
		this.detailProduct = detailProduct;
	}

	public String execute() {
		listCategory = categoryService.getList();
		if (cat_id != 0 && cat_id != -1) {
			listProduct = productService.getListByColumn("category_id", cat_id);
		} else {
			listProduct = productService.getList();
		}
		return SUCCESS;
	}

	public String product_add_form() {
		inputProduct = new Product();
		listCategory = categoryService.getList();
		return SUCCESS;
	}

	public String product_add() {
		List<Image> images = new ArrayList<Image>();
		for (String str : inputImages.split(";")) {
			Image i = new Image();
			i.setImg_url(str);
			i.setProduct(inputProduct);
			images.add(i);
		}
		inputProduct.setImages(images);
		inputProduct.setCategory(categoryService.getEntity(categoryId));
		productService.save(inputProduct);
		categoryId = 0;
		inputImages = null;
		return SUCCESS;
	}

	public String product_delete() {
		productService.delete(id_del);
		return SUCCESS;
	}

	public String showDetails() {
		Product detail = productService.getEntity(prod_id);
		if (detail != null) {
			listImages = imageService.getListByColumn("product_id", prod_id);
			detailProduct = detail;
		}
		return SUCCESS;
	}

	public String product_sold() {
		Product detail = productService.getEntity(prod_id);
		detail.setCategory(categoryService.getEntity(9999));
		productService.save(detail);
		return SUCCESS;
	}
}
