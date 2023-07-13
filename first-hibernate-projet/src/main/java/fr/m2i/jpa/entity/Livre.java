package main.java.fr.m2i.jpa.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//TABLE PER CLASS @Table//(name="Livre")
// SINGLE TABLE
@DiscriminatorValue("1")
public class Livre extends Document{

	private String editor;

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Livre(String editor) {
		super();
		this.editor = editor;
	}

	public Livre() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "Livre [editor=" + editor + "]";
	}
	
	
}
