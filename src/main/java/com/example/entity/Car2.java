package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="car2")
public class Car2 {
	@Id
	private int id ;
	private String name ;
	private int price ;
	
	@OneToOne(mappedBy = "car")
	private Engine2 engine ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Engine2 getEngine() {
		return engine;
	}
	public void setEngine(Engine2 engine) {
		this.engine = engine;
	}
	
	
}
