package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	 
	@Id
	 private int tId ;
	 private String tName ;
	 private String tEmail ;
	 public Teacher(int tId, String tName, String tEmail) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tEmail = tEmail;
	 }
	 public Teacher() {
		super();
	 }
	 public int gettId() {
		 return tId;
	 }
	 public void settId(int tId) {
		 this.tId = tId;
	 }
	 public String gettName() {
		 return tName;
	 }
	 public void settName(String tName) {
		 this.tName = tName;
	 }
	 public String gettEmail() {
		 return tEmail;
	 }
	 public void settEmail(String tEmail) {
		 this.tEmail = tEmail;
	 }
	 
	 
}
