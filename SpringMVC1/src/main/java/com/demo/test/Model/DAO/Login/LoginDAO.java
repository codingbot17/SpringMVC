package com.demo.test.Model.DAO.Login;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Login.LoginDTO;
import com.demo.test.DTO.Registration.StudentDTO;

@Repository
public class LoginDAO 
{
	@Autowired
	private SessionFactory fact;
	
	public LoginDAO()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	public StudentDTO userLoginDAO(LoginDTO dto)
	{
		System.out.println("user Login DAO started");
		Session session=fact.openSession();
		Query qry= session.createQuery("from StudentDTO dto where dto.semail='"+dto.getSemail()+"' and dto.spass='"+dto.getSpass()+"' ");
		StudentDTO fromdb=(StudentDTO) qry.uniqueResult();
		System.out.println("user Login DAO ended");
		return fromdb;
	}


}
