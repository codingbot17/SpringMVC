package com.demo.test.Model.DAO.Update;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.DTO.Update.UpdateDTO;

@Repository
public class UpdateDAO 
{
	@Autowired
	private SessionFactory fact;

	public UpdateDAO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public StudentDTO userUpdateDAO(UpdateDTO dto)
	{
		System.out.println("user Update DAO started");
		Session session=fact.openSession();
		Query qry= session.createQuery("update StudentDTO dto set dto.student_name='"+dto.getSname()+"' where dto.sid='"+dto.getSid()+"'");
		StudentDTO fromdb=(StudentDTO) qry.uniqueResult();
		System.out.println("user Update DAO ended");
		return fromdb;
	}
	

}
