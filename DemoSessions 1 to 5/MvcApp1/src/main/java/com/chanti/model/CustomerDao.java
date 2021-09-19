package com.chanti.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class CustomerDao 
{
	static Connection con=null;
	//select email from customers where email=?   	=>  ResultSet executeQuery(query)    1.boolean next()
	public static boolean isEmailIdExist(String email)
	{
		System.out.println("CustomerDao.isEmailIdExist() entry:"+email);
		boolean res=false;
		try
		{
			con=DbCon.getDbCon();
			PreparedStatement pst=con.prepareStatement("select mailid from customers where mailid=?");
			pst.setString(1, email);
			ResultSet rs=pst. executeQuery();
			res=rs.next();
		}
		catch(Exception e)	{			e.printStackTrace();		}
		System.out.println("CustomerDao.isEmailIdExist() exit:"+res);
		return res;
	}

	//insert into customers values(?,?,?,?)			=>	int executeUpdate(query)	
	public static int saveCustomer(Customer customer)
	{
		int res=0;
		try
		{
			con=DbCon.getDbCon();
			PreparedStatement pst=con.prepareStatement("insert into customers values(?,?,?,?)");
			pst.setString(1, customer.getName());
			pst.setString(2, customer.getMailId());
			pst.setString(3, customer.getPassword());
			pst.setString(4, customer.getRePassword());
			res=pst.executeUpdate();
		}
		catch(Exception e)	{			e.printStackTrace();		}
		return res;
	}
	//update customers set name=?,password=?,repassword=? where mailid=?
	public static int updateCustomer(Customer customer)
	{
		int res=0;
		try
		{
			con=DbCon.getDbCon();
			PreparedStatement pst=con.prepareStatement("update customers set name=?,password=?,repassword=? where mailid=?");
			pst.setString(1, customer.getName());
			pst.setString(4, customer.getMailId());
			pst.setString(2, customer.getPassword());
			pst.setString(3, customer.getRePassword());
			res=pst.executeUpdate();
		}
		catch(Exception e)	{			e.printStackTrace();		}
		return res;
	}
	//delete from customers where mailid=?
	static int deleteCustomer(String mailid)
	{
		int res=0;
		try
		{
			con=DbCon.getDbCon();
			PreparedStatement pst=con.prepareStatement("delete from customers where mailid=?");
			pst.setString(1, mailid);
			res=pst.executeUpdate();
		}
		catch(Exception e)	{			e.printStackTrace();		}
		return res;
	}
	//select * from customers
	public static List<Customer> findAllCustomers()
	{
		List<Customer> customersList=null;
		try
		{
			customersList=new ArrayList<Customer>();
			PreparedStatement pst=con.prepareStatement("select * from customers");
			ResultSet rs = pst.executeQuery();
			while(rs.next())  
			{
				Customer customer=new Customer();
				customer.setName(rs.getString(1));
				customer.setMailId(rs.getString(2));
				customer.setPassword(rs.getString(3));
				customer.setRePassword(rs.getString(4));
				customersList.add(customer);
			}
		}
		catch(Exception e) {e.printStackTrace();}
		return customersList;
	}
	//select * from customers where mailid=?
	public static Customer findCustomerByEmailId(String mailid)
	{
		Customer customer=null;
		try
		{
			customer=new Customer();
			PreparedStatement pst=con.prepareStatement("select * from customers where mailid=?");
			pst.setString(1, mailid);
			ResultSet rs = pst.executeQuery();
			rs.next();  
			customer.setName(rs.getString(1));
			customer.setMailId(rs.getString(2));
			customer.setPassword(rs.getString(3));
			customer.setRePassword(rs.getString(4));
		}
		catch(Exception e) {e.printStackTrace();}
		return customer;
	}

}












