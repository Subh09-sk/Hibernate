package com.example;

import com.example.entity.Product;
import com.example.entity.Reviews;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ReviewDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		System.out.println("Cconnection established");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
//		Product pr = new Product();
//		pr.setPid(3);
//		pr.setName("Fridge");
//		pr.setPrice(12000);
//		
//		Reviews r1 = new Reviews();
//		r1.setCid(301);
//		r1.setName("User1");
//		r1.setMsg("Good");
//		r1.setProduct(pr);
//		
//		Reviews r2 = new Reviews();
//		r2.setCid(302);
//		r2.setName("User2");
//		r2.setMsg("Average");
//		r2.setProduct(pr);
//		
//		et.begin();
//		em.persist(pr);
//		em.persist(r1);
//		em.persist(r2);
//		et.commit();
		
//		Reviews rev =em.find(Reviews.class, 201);
//		if(rev != null) {
////			System.out.println(rev.getName()+" "+rev.getMsg());
//			Product prod =rev.getProduct();
//			if(prod != null) {
//				System.out.println(prod.getName()+" has reviews "+ rev.getMsg()+" by"+rev.getName());
//			}
//		}
		
		Product prod = em.find(Product.class, 2);
		if(prod != null) {
			System.out.println(prod.getName());
		}
	}
}
