package com.chanti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chanti.model.Customer;
import com.chanti.model.CustomerDao;


@WebServlet("/reg.do")
public class CustomerSignUp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("CustomerSignUp.doGet()");
		//1.get data from html form
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pswd = request.getParameter("password");
		String repswd = request.getParameter("repassword");
		//2.set form data to model class object
		Customer customer=new Customer();
		customer.setName(name);
		customer.setMailId(email);
		customer.setPassword(pswd);
		customer.setRePassword(repswd);
		//3.call dao methods & generate response
		if(CustomerDao.isEmailIdExist(email))
		{
			response.sendRedirect("views\\customersignuperror.jsp");
		}
		else
		{
			if(CustomerDao.saveCustomer(customer)>0)
			{
				response.sendRedirect("views\\customersignupsuccess.jsp");
				
			}
			else
			{
				System.out.println("ERROR during reg");
			}
		}
		
	}

}
