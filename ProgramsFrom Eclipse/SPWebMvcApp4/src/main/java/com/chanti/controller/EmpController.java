package com.chanti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chanti.model.Emp;
import com.chanti.model.EmpDao;

@Controller    
public class EmpController 
{    
    @Autowired    
    EmpDao dao;
    
    @RequestMapping("/empform")    
    public String showform(Model m)
    {    
    	Emp emp=new Emp();
        m.addAttribute("emp",emp );  
        return "empform";   
    }   
    
    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("emp") Emp emp)
    {    
        int res=dao.save(emp);
        System.out.println("EmpController.save():"+res);
        return "empform"; 
    }    
    @RequestMapping("/viewemp")    
    public String viewemp(Model m)
    {    
        List<Emp> list=dao.getEmployees();    
        m.addAttribute("list",list);  
        return "viewemp";    
    }    
    @RequestMapping(value="/showemp/{id}")    
    public String edit(@PathVariable int id, Model m)
    {    
        Emp emp=dao.getEmpById(id);    
        m.addAttribute("emp",emp);  
        return "showempform";    
    }  
}