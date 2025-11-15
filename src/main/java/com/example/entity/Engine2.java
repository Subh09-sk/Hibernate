package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="engine2")
public class Engine2 {
	@Id
	private int id ;
	private String type ;
	private int cc ;
	
	@OneToOne
	private Car2 car ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public Car2 getCar() {
		return car;
	}

	public void setCar(Car2 car) {
		this.car = car;
	}
	
	
}
