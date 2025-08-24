package com.nutridiet.project.service;

import com.nutridiet.project.model.User;

public interface UserService
{
	public String UserRegistration(User u);
	public User checkuserlogin(String email,String password);
	public String UpdateUserProfile(User user);
	public User displayUserByID(int uid);
}
