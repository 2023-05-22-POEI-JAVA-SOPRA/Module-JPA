package main.java.fr.m2i.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name = "user_informations")
public class UserDetails {

	@Column( name = "id_user_informations") @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private int idUserInformations;
	
	private String address;
	
	private String city;
	
	//@Column(name="email")
	private String email; 
	
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@OneToOne
	@JoinColumn( name = "user_id")
	private User user;
	

	public int getId_user_informations() {
		return idUserInformations;
	}

	public void setId_user_informations(int id_user_informations) {
		this.idUserInformations = id_user_informations;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public UserDetails() {
		super();
	}

	public int getIdUserInformations() {
		return idUserInformations;
	}

	public void setIdUserInformations(int idUserInformations) {
		this.idUserInformations = idUserInformations;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserDetails(String address, String city, String email, String phoneNumber) {
		super();
		this.address = address;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}


	
	
}
