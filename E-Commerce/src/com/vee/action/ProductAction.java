package com.vee.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.vee.model.Image;
import com.vee.model.Product;
import com.vee.services.GenericService;

public class ProductAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6965077850339261446L;
	private GenericService<Product> productService;
	private List<Product> listProduct;
	private Product inputProduct = new Product();
	private String inputImages;
	private int id_del;

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

	public GenericService<Product> getProductService() {
		return productService;
	}

	public void setProductService(GenericService<Product> productService) {
		this.productService = productService;
	}

	public String execute() {
		listProduct = productService.getList();
		return SUCCESS;
	}

	public String product_add() {
		List<Image> images = new ArrayList<Image>();
		for (String str : inputImages.split(";")) {
			Image i = new Image();
			i.setImg_url(str);
			i.setProduct(inputProduct);
			
		}
		productService.save(inputProduct);
		return SUCCESS;
	}

	public String product_delete() {
		productService.delete(id_del);
		return SUCCESS;
	}
}
