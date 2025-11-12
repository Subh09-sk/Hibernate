package com.example;

import java.util.List;

import com.example.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Demoo {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		System.out.println("Cconnection established");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		
		// INSERT DATA INTO DATABASE 
//		Student student = new Student(2,"Subh",21,"A+");  // Parameterized constructor called 
//		Student student = new Student();
//		student.setName("Amrit");
//		student.setAge(21);
//		student.setId(3);
//		student.setBloodGroup("O+");
//		et.begin();
//		em.persist(student);
//		et.commit();
		
		//Find The data by ID 
//		Student student = em.find(Student.class, 1);
//		if(student != null) {
//			System.out.println(student.getDetails());
//		}
//		else {
//			System.out.println("Id not found");
//		}
		
		//Remove data from database 
//		Student student = em.find(Student.class, 3);
//		et.begin();
//		if(student != null) {
//			System.out.println(student.getDetails());
//			em.remove(student);
//			et.commit();
//		}
//		else {
//			System.out.println("Id not found");
//		}
		
		//Fetch all the data from database 
		
//		Query query = em.createQuery("from Student");
//		
//		List<Student> list = query.getResultList();
//		
//		for(Student student : list) {
//			System.out.println(student.getDetails());
//		}
		
		//Filter the record 
		
		Query query = em.createQuery("select s from Student s where s.age= 22");
		
		List<Student> list = query.getResultList();
		
		for(Student student : list) {
			System.out.println(student.getDetails());
			em.remove(student);
		}
	}
}
















