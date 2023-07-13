package main.java.fr.m2i.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity @Table//(name="These")
public class These extends Document{

	private String discipline;

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public These(String discipline) {
		super();
		this.discipline = discipline;
	}

	public These() {
		super();
	}

	@Override
	public String toString() {
		return super.toString() + "These [discipline=" + discipline + "]";
	}
	
	
}
