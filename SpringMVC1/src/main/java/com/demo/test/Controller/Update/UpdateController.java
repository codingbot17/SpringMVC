package com.demo.test.Controller.Update;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.test.DTO.Registration.StudentDTO;
import com.demo.test.DTO.Update.UpdateDTO;
import com.demo.test.Model.Service.Update.UpdateService;

@Controller
public class UpdateController 
{
	@Autowired
	private UpdateService service;

	
	HttpSession session;
	
	public UpdateController() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
		
	}
	
	@RequestMapping(value="/update.do",method = RequestMethod.POST)
	public ModelAndView userUpdateController(UpdateDTO dto,HttpServletRequest req)
	{
		System.out.println("user Update Controller started");
		StudentDTO fromdb= service.userUpdateService(dto);
		System.out.println("user Update Controller ended");
		if(fromdb!=null)
		{
			session=req.getSession();
			session.setAttribute("student", fromdb);
			return new ModelAndView("/Home.jsp");
		}
		else
		{
			return new ModelAndView("/Login.jsp");
		}
		
	}
	

}
