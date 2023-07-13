package main.java.fr.m2i.jpa.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // TABLE_PER_CLASS : Une table par class enfant de notre Document
// SINGLE TABLE 
/*
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(
		name = "discriminant", 
		discriminatorType = DiscriminatorType.INTEGER
)
*/
@Inheritance(strategy = InheritanceType.JOINED)
@Table
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


/*
CREATE TABLE Document(
    discriminant INT,    
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255) NOT NULL,
    
    
	editor VARCHAR(255),
    
    discipline VARCHAR(255)
);

INSERT INTO Document(title, author, discriminant, editor, discipline) VALUES
("Java", "jee", 1, "Oracle", NULL),
("Java", "jee", 2, NULL, "Informatique");



CREATE TABLE Livre(
	id INT PRIMARY KEY,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255) NOT NULL,
    editor VARCHAR(255)
);

DROP TABLE Livre;
INSERT INTO Livre (id, title, author, editor) VALUES
(1, "Toto", "Toto", "Toto"),
(4, "Lala", "Lala", "Lala"),
(3, "Tutu", "Tutu", "Tutu");

CREATE TABLE These(
	id INT PRIMARY KEY,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255) NOT NULL,
    discipline VARCHAR(255)
);
INSERT INTO These (id, title, author, discipline) VALUES
(2, "These", "These", "These"),
(5, "discipline", "discipline", "discipline"),
(6, "author", "author", "author");





CREATE TABLE Document(
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
	author VARCHAR(255) NOT NULL
);
INSERT INTO Document (title, author) VALUES
( "Lala", "Lala" ),
( "Tutu", "Tutu"),
( "discipline", "discipline"),
( "author", "author");

CREATE TABLE Livre(
	id INT PRIMARY KEY REFERENCES Document(id),
    editor VARCHAR(255)
);
DROP TABLE Livre;
INSERT INTO Livre (id, editor) VALUES
(1, "Lala"),
(3, "discipline");

CREATE TABLE These(
	id INT PRIMARY KEY REFERENCES Document(id),
    discipline VARCHAR(255)
);
INSERT INTO These (id, discipline) VALUES
(2, "Lala"),
(4, "discipline");
DROP TABLE Livre, These, Document;
*/
