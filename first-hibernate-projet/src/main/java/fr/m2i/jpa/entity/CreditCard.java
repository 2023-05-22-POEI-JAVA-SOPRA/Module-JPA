package main.java.fr.m2i.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table( name="credit_card")
public class CreditCard {
	
	@Column(name = "id_credit_card")
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "card_code")
	private String card;
	
	@Column(name = "date_exp")
    private String dateExp;
    
	@ManyToOne
	@JoinColumn( name= "user_id")
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getDateExp() {
		return dateExp;
	}

	public void setDateExp(String dateExp) {
		this.dateExp = dateExp;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CreditCard(int id, String card, String dateExp, User user) {
		super();
		this.id = id;
		this.card = card;
		this.dateExp = dateExp;
		this.user = user;
	}

	public CreditCard() {
		super();
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", card=" + card + ", dateExp=" + dateExp + "]";
	}
    
    

}
