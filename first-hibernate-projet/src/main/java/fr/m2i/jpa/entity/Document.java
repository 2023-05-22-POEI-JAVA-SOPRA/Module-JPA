package main.java.fr.m2i.jpa.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // TABLE_PER_CLASS : Une table par class enfant de notre Document
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // SIGNLE TABLE
@DiscriminatorColumn(
		name = "discriminant", 
		discriminatorType = DiscriminatorType.INTEGER
)
public abstract class Document {

	@Id 
	// TABLE PER CLASS @GeneratedValue(strategy = GenerationType.SEQUENCE) // Signifie que l'ID n'est plus gérer par la base de donnée
	// SINGLE TABLE
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Document() {
		super();
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", tile=" + title + ", author=" + author + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
