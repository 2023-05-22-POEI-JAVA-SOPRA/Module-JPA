package main.java.fr.m2i.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table//(name="Livre")
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
