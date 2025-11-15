package com.example;


import java.util.ArrayList;
import java.util.List;

import com.example.entity.Students;
import com.example.entity.Subjects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("girish");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Subjects sub1 = new Subjects();
//		sub1.setSid(1);
//		sub1.setSname("java");
//		
//		Subjects sub2 = new Subjects();
//		sub2.setSid(2);
//		sub2.setSname("JDBC");
//		
//		List<Subjects> subs = new ArrayList<Subjects>();
//		subs.add(sub1);
//		subs.add(sub2);
//		
//		Students st1 = new Students();
//		st1.setId(101);
//		st1.setName("Subh");
//		st1.setSubjects(subs);
//		
//		et.begin();
//		em.persist(st1);
//		em.persist(sub1);
//		em.persist(sub2);
//		et.commit();
		
		// Adding student for existing subject along with adding another subject
//		et.begin();
//		Subjects sub2 = em.find(Subjects.class, 1);
//		if(sub2 != null) {
//			Subjects sub1 = new Subjects();
//			sub1.setSid(3);
//			sub1.setSname("Apti");
//			
//			List<Subjects> subs = new ArrayList<Subjects>();
//			subs.add(sub1);
//			subs.add(sub2);
//			
//			Students st1 = new Students();
//			st1.setId(102);
//			st1.setName("Das");
//			st1.setSubjects(subs);
//			
//			em.persist(st1);
//			em.persist(sub1);
//			et.commit();
		
//		}
		
		//Adding new student for existing subject 
		et.begin();
		Subjects sub1 = em.find(Subjects.class, 1);
		Subjects sub2 = em.find(Subjects.class, 2);
		Subjects sub3 = em.find(Subjects.class, 3);
		
		if(sub2 != null && sub2 != null ) {
			List<Subjects> subs = new ArrayList<Subjects>();
			subs.add(sub1);
			subs.add(sub2);
			subs.add(sub3);
			
			Students st1 = new Students();
			st1.setId(103);
			st1.setName("SK");
			st1.setSubjects(subs);
			
			em.persist(st1);
			et.commit();
		}
	}
}
