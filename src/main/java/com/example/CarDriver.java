package com.example;

import com.example.entity.Car;
import com.example.entity.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CarDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		System.out.println("Cconnection established");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
//		Car car = new Car();
//		car.setId(102);
//		car.setName("BMW");
//		car.setPrice(765421);
//		
//		Engine engine = new Engine();
//		engine.setId(1);
//		engine.setType("petrol");
//		engine.setCc(3200);
		
//		car.setEngine(engine);
//		
//		et.begin();
//		em.persist(car);
//		em.persist(engine);
//		et.commit();
		
		
		//Update car
//		et.begin();
//		Car car = em.find(Car.class, 102);
////		Engine engine = em.find(Engine.class, 1);
//		if(car != null) {
//			car.setPrice(900000);
//			em.merge(car);
//			et.commit();
//		}
//		else {
//			System.out.println("Id not found");
//		}
		
		
		// Update car and engine symontaneouly
//		
//		et.begin();
//		Car car = em.find(Car.class, 102);
//		Engine engine = car.getEngine();
//		if(car != null && engine != null) {
//			car.setName("Audi Q7");
//			engine.setCc(3500);
//			em.merge(car);
//			em.merge(engine);
//			et.commit();
//		}
//		else {
//			System.out.println("Id invalid");
//		}
		
		//Delete engine not possible 
//		et.begin();
//		Engine engine = em.find(Engine.class, 1);
//		if(engine != null) {
//			em.remove(engine);
//			et.commit(); 
//		}
	}
}
