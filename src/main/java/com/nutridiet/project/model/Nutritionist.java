package com.nutridiet.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nutritionist_table")
public class Nutritionist
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name = "nname",nullable = false)
	String nname;
	@Column(name = "nemail",nullable = false,unique = true)
	String nemail;
	@Column(name = "nage",nullable = false)
	String nage;
	@Column(name = "ncontact",nullable = false,unique = true)
	String ncontact;
	@Column(name = "nspecification",nullable = false)
	String nspecification;
	@Column(name = "nexperience",nullable = false)
	String nexperience;
	@Column(name = "neducation",nullable = false)
	String neducation;
	@Column(name = "npassword",nullable = false)
	String npassword;
	
	@Override
	public String toString() {
		return "NutritionistController [id=" + id + ", nname=" + nname + ", nemail=" + nemail + ", nage=" + nage
				+ ", ncontact=" + ncontact + ", nspecification=" + nspecification + ", nexperience=" + nexperience
				+ ", neducation=" + neducation + ", npassword=" + npassword + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNname() {
		return nname;
	}
	public void setNname(String nname) {
		this.nname = nname;
	}
	public String getNemail() {
		return nemail;
	}
	public void setNemail(String nemail) {
		this.nemail = nemail;
	}
	public String getNage() {
		return nage;
	}
	public void setNage(String nage) {
		this.nage = nage;
	}
	public String getNcontact() {
		return ncontact;
	}
	public void setNcontact(String ncontact) {
		this.ncontact = ncontact;
	}
	public String getNspecification() {
		return nspecification;
	}
	public void setNspecification(String nspecification) {
		this.nspecification = nspecification;
	}
	public String getNexperience() {
		return nexperience;
	}
	public void setNexperience(String nexperience) {
		this.nexperience = nexperience;
	}
	public String getNeducation() {
		return neducation;
	}
	public void setNeducation(String neducation) {
		this.neducation = neducation;
	}
	public String getNpassword() {
		return npassword;
	}
	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}
}
