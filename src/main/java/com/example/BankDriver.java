package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Accounts;
import com.example.entity.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BankDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("girish");
		System.out.println("Cconnection established");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
//		Accounts ac1 = new Accounts();
//		ac1.setAcid(301);
//		ac1.setName("Subh");
//		ac1.setBalance(50000);
//		
//		Accounts ac2 = new Accounts();
//		ac2.setAcid(302);
//		ac2.setName("Amrit");
//		ac2.setBalance(40000);
//		
//		Accounts ac3 = new Accounts();
//		ac3.setAcid(303);
//		ac3.setName("arpita");
//		ac3.setBalance(40000);
//		
//		List<Accounts> accounts = new ArrayList<Accounts>();
//		accounts.add(ac1);
//		accounts.add(ac2);
//		accounts.add(ac3);
		
		
//		Bank b1 = new Bank();
//		b1.setId(1);
//		b1.setName("SBI");
//		b1.setAccounts(accounts);
		
//		Bank bank = new Bank();
//		bank.setId(3);
//		bank.setName("HDFC");
//		bank.setAccounts(accounts);
		
//		et.begin();
//		em.persist(bank);
//		et.commit();
		
//		Accounts ac1 = em.find(Accounts.class, 302);
//		if(ac1 != null) {
//			System.out.println(ac1.getName());
//		}
		
//		Bank bank = em.find(Bank.class, 3);
//		List<Accounts> accounts = bank.getAccounts();
//		if(bank != null && accounts != null) {
//			System.out.println(bank.getName());
//			for(Accounts acc : accounts) {
//				System.out.println(acc.getName()+" account is present in "+bank.getName());
//			}
//		}
		
		
		
		//DELETE accounts from BANK 
//		et.begin();
//		Bank bank = em.find(Bank.class, 3);
//		Accounts acc = em.find(Accounts.class, 302);
//			if(bank != null && acc != null) {
//				bank.getAccounts().remove(acc);
//				em.remove(acc);
//				em.merge(bank);
//				et.commit();
//			}
		
		//THis will change total 
//		Accounts acc = new Accounts();
//		acc.setAcid(303);
//		acc.setName("Arpita");
//		acc.setBalance(40000);
//		
//		List<Accounts> accounts = new ArrayList<Accounts>();
//		accounts.add(acc);
//		
//		et.begin();
//		Bank bank = em.find(Bank.class, 3);
//		if(bank != null) {
//			bank.setAccounts(accounts);
//			em.merge(bank);
//			et.commit();
//		}
		
		//ADD new Accounts
		
//		et.begin();
//		Bank bank1 = em.find(Bank.class, 3);
//		if(bank1 != null) {
//			bank1.getAccounts().add(acc);
//			em.merge(bank1);
//			et.commit();
//		}
	}
}










