package com.nutridiet.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutridiet.project.model.Nutritionist;
import com.nutridiet.project.repository.NutritionistRepository;

@Service
public class NutritionistServiceImpl implements NutritionistService
{
	@Autowired
	private NutritionistRepository nutritionistRepository;

	@Override
	public String NutritionistRegistration(Nutritionist n) {
		nutritionistRepository.save(n);
		return "Nutritionist Added Successfully";
	}

	@Override
	public Nutritionist checknutrilogin(String nemail, String npassword) {
		return nutritionistRepository.checknutrilogin(nemail, npassword);
	}

	@Override
	public List<Nutritionist> displayNutritionistsBySpecification(String nspecification) {
		return nutritionistRepository.findByNspecification(nspecification);
		
	}
	
}
