package main.java.fr.m2i.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table//( name = "(Optional) The name of the table. by Defaults class name is equal to table name")
public class ProductDetails {

	// Nom du champ dans la bdd
	@Column(name = "id_product_details") 
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	// Clé primaire gérer par la bdd
	private int id;
	
    private int stock;
    private String supplier;
    private float purchasePrice;
    
    // Précise que la relation est 1..1 
    @OneToOne 
    // Précise quel champ dans la table productDetails sert à récupérer un Product
    @JoinColumn(name = "id_product") 
    private Product product;
       
    
    public Product getProduct() {
		return product;
	}
    
    public void setProduct(Product product) {
		this.product = product;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public float getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public ProductDetails(int id, int stock, String supplier, float purchasePrice) {
		super();
		this.id = id;
		this.stock = stock;
		this.supplier = supplier;
		this.purchasePrice = purchasePrice;
	}
	public ProductDetails() {
		super();
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", stock=" + stock + ", supplier=" + supplier + ", purchasePrice="
				+ purchasePrice + "]";
	}

	
    
    
    
	
}
