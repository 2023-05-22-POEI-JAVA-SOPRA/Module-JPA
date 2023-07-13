package main.java.fr.m2i.jpa.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity @Table
public class Shop {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String addresse;
	
	private String pays;
	
	private int CA;

	@ManyToMany
	@JoinTable(
		name = "product_shop_association",
		joinColumns = @JoinColumn(name ="shop_id"),
		inverseJoinColumns = @JoinColumn(name = "product_id")
	)
	List<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getCA() {
		return CA;
	}

	public void setCA(int cA) {
		CA = cA;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Shop() {
		super();
	}

	@Override
	public String toString() {
		return "Shop [id=" + id + ", addresse=" + addresse + ", pays=" + pays + ", CA=" + CA + "]";
	}
	
	
}
