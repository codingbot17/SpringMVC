package com.demo.test.Model.Service.Update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.DTO.Update.UpdateDTO;
import com.demo.test.Model.DAO.Update.UpdateDAO;

@Service
public class UpdateService 
{
	@Autowired
	private UpdateDAO dao;

	public UpdateService()
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public StudentDTO userUpdateService(UpdateDTO dto)
	{
		System.out.println("user Update Service started");
		StudentDTO fromdb= dao.userUpdateDAO(dto);
		System.out.println("user Update Service ended");
		return fromdb;
		
	}
	

}
