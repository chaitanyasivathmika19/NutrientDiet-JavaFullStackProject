package com.nutridiet.project.service;

import java.util.List;

import com.nutridiet.project.model.Nutritionist;

public interface NutritionistService
{
	public String NutritionistRegistration(Nutritionist n);
	
	public Nutritionist checknutrilogin(String nemail,String npassword);
	
//	 public List<Nutritionist> displayNutritionistsBySpecification(String nspecification);
	 
	 public List<Nutritionist> displayNutritionistsBySpecification(String nspecification);
}
