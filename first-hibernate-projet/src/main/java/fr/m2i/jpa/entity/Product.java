package main.java.fr.m2i.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table//(name = "Product")
public class Product {
	
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY )
	private int id;
	
	private String name;
	
	private String description;
	
	private float price; 
	
	private int quantity;

	@OneToOne( mappedBy = "product") // Précise que la relation se fait dans l'autre table, et que l'on peut récupérer le champ par attribut inverse 
	// (MappedBy représente le nom de l'attribut dans le model inverse)
	private ProductDetails productDetails;
	
	public ProductDetails getProductDetails() {
		return productDetails;
	}
	
	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(int quantity, String description, String name, float price) {
		super();
		this.quantity = quantity;
		this.description = description;
		this.name = name;
		this.price = price;
	}

	public Product() {
		super();
		System.out.println("In default constructor");
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + ", productDetails=" + productDetails + "]";
	}


	
	
	
	
	
}