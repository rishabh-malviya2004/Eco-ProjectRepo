package com.rishabh.ecom_proj.model;

import java.math.BigDecimal;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	//@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
	private Date releaseDate;
	private boolean productAvailable;
	private int stockQuantity;
	private String imageName;
	private String imageType;
	@Lob
	private byte[] imagedate;
	public Product(int id, String name, String disc, String brand, BigDecimal price, String catogory, Date releaseDate,
			boolean available, int quantity, String imageName, String imageType, byte[] imagedate) {
		super();
		this.id = id;
		this.name = name;
		this.description = disc;
		this.brand = brand;
		this.price = price;
		this.category = catogory;
		this.releaseDate = releaseDate;
		this.productAvailable = available;
		this.stockQuantity = quantity;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imagedate = imagedate;
	}
	public Product() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisc() {
		return description;
	}
	public void setDisc(String disc) {
		this.description = disc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCatogory() {
		return category;
	}
	public void setCatogory(String catogory) {
		this.category = catogory;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isAvailable() {
		return productAvailable;
	}
	public void setAvailable(boolean available) {
		this.productAvailable = available;
	}
	public int getQuantity() {
		return stockQuantity;
	}
	public void setQuantity(int quantity) {
		this.stockQuantity = quantity;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public byte[] getImagedate() {
		return imagedate;
	}
	public void setImagedate(byte[] imagedate) {
		this.imagedate = imagedate;
	}
	
	
}
