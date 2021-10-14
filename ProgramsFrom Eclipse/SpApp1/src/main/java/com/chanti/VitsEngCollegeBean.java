package com.chanti;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class VitsEngCollegeBean {
	//Dependency in the form of Collections
	private List<String> studentNames;
	private Set<Integer> studentRollNumbers;
	private Map<String,Integer> branchDetails;
	private Properties branchInfos;
	//Setter Injection
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public void setStudentRollNumbers(Set<Integer> studentRollNumbers) {
		this.studentRollNumbers = studentRollNumbers;
	}
	public void setBranchDetails(Map<String, Integer> branchDetails) {
		this.branchDetails = branchDetails;
	}
	public void setBranchInfos(Properties branchInfos) {
		this.branchInfos = branchInfos;
	}
	//Business methods
	public void printStudentNames()
	{
		System.out.println("----------ALL STUDENT NAMES ARE------------");
		for(String name:studentNames)
		{
			System.out.println(name);
		}
	}
	public void printStudentRollNumbers()
	{
		System.out.println("----------ALL STUDENT ROLL NUMBERS ARE------------");
		for(Integer number:studentRollNumbers)
		{
			System.out.println(number);
		}
	}
	public void printBranchDetails()
	{
		System.out.println("----------BRANCH DETAILS ARE------------");
		for(Map.Entry<String,Integer> entry:branchDetails.entrySet())
		{
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
	public void printBranchInfo()
	{
		System.out.println("----------BRANCH INFO ARE------------");
		Set<String> keys = branchInfos.stringPropertyNames();
	    for (String key : keys) {
	      System.out.println(key + "-->" + branchInfos.getProperty(key));
	    }
	}
}
