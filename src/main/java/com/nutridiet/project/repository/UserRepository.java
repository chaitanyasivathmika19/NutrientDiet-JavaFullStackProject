package com.nutridiet.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nutridiet.project.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("select u from User u where u.uemail=?1 and u.upassword=?2")
	public User checkemplogin(String email,String pwd);	
	
	@Query("update User u set u.uage=?1 where u.id=?2")
	@Modifying
	@Transactional 
	public int updateUserProfile(String age,int eid);
	
	

}
