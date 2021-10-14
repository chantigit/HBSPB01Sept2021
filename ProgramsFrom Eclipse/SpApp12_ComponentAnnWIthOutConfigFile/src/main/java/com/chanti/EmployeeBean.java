package com.chanti;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean				
{
	@Value("James")
	private String empName;
	
	public EmployeeBean() {
		System.out.println("----EmployeeBean.EmployeeBean()----");
	}

	
	public void showEmpInfo()
	{
		System.out.println("EMp Name is:"+empName);
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}











