package com.nutridiet.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nutridiet.project.model.Nutritionist;
import com.nutridiet.project.model.User;
import com.nutridiet.project.service.NutritionistService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class NutritionistController
{
	@Autowired
	private NutritionistService nutritionistService;

	
	@GetMapping("nusignup")
	public ModelAndView nusignup()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("nusignup");
		return mv;
	}
	
	@GetMapping("nulogin")
	public ModelAndView nutrilogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("nulogin");
		return mv;
	}
	
	@PostMapping("insertnutritionist")
	public ModelAndView insertnutritionist(HttpServletRequest request)
	{
		String nname = request.getParameter("nname");
		String nemail = request.getParameter("nemail");	  
		String nage = request.getParameter("nage");
	    String ncontact=request.getParameter("ncontact");
	    String nspecification = request.getParameter("nspecification");	    
	    String nexperience = request.getParameter("nexperience");
	    String neducation=request.getParameter("neducation");
	    String npassword=request.getParameter("npassword");
	    
	    Nutritionist nutri = new Nutritionist();
	    
	    nutri.setNname(nname);
	    nutri.setNemail(nemail);
	    nutri.setNage(nage);
	    nutri.setNcontact(ncontact);
	    nutri.setNspecification(nspecification);
	    nutri.setNexperience(nexperience);
	    nutri.setNeducation(neducation);
	    nutri.setNpassword(npassword);
	      
	    String msg = nutritionistService.NutritionistRegistration(nutri);
	    
	    ModelAndView mv = new ModelAndView("nulogin");
	    mv.addObject("message", msg);
	    return mv;

	   }
	
	
	@PostMapping("checknutrilogin")
	public ModelAndView checknutrilogin(HttpServletRequest request) {
	    ModelAndView mv = new ModelAndView();

	    String nemail = request.getParameter("nemail");
	    String npassword = request.getParameter("npassword");

	    Nutritionist nutri = nutritionistService.checknutrilogin(nemail, npassword);

	    if (nutri != null) {
	        HttpSession session = request.getSession(); 
	        session.setAttribute("nutri", nutri);         
	        mv.setViewName("nuhome");                 
	    } else {
	        mv.setViewName("nulogin");                
	        mv.addObject("message", "Wrong Credentials Used");
	    }

	    return mv;
	}

	
	@GetMapping("nutrihome")
	public ModelAndView nutrihome()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("nutrihome");
		return mv;
	}

	@GetMapping("viewnutritionistsbypecification")
	public ModelAndView viewnutritionistsbypecification(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("viewnutritionistsbypecification");
		
		HttpSession session = request.getSession();
		Nutritionist nutri = (Nutritionist)session.getAttribute("nutritionist"); //employee is session object
//		List<Nutritionist> nutritionistlist =  nutritionistService.displaynutritionistsbyspecification(nutri.getNspecification());
//		mv.addObject("nutritionistlist", nutritionistlist);
//		return mv;
		if (nutri == null || nutri.getNspecification() == null) {
	        mv.addObject("error", "No specification found for the current nutritionist.");
	        return mv; // Return early with an error message
	    }
		List<Nutritionist> viewnutritionistsbypecification = nutritionistService.displayNutritionistsBySpecification(nutri.getNspecification());
		mv.addObject("nutritionistlist", viewnutritionistsbypecification);

	    return mv;
	
	}
	
//	@GetMapping("viewnutritionistsbypecification")
//	public ModelAndView viewnutritionistsbypecification(@RequestParam("specification") String specification, HttpServletRequest request) {
//	    ModelAndView mv = new ModelAndView("viewnutritionistsbypecification");
//
//	    // Get nutritionists based on the specification
//	    if (specification == null || specification.isEmpty()) {
//	        mv.addObject("error", "No specification provided.");
//	        return mv; // Return with an error if no specification is provided
//	    }
//
//	    // Fetch nutritionists by specification
//	    List<Nutritionist> nutritionistList = nutritionistService.displayNutritionistsBySpecification(specification);
//	    mv.addObject("nutritionistlist", nutritionistList);
//
//	    return mv;
//	}
	
	

	
	
	
}
