package com.service;

import java.util.ArrayList;

import java.util.List;


import com.bean.Users;

public class UsersService {
	public String checkUser(String emailid,String password) {
		  if(emailid.equals("abc@gmail.com") && password.equals("123")) {
			  return "success";
			  }else {
				  return "failure";
			  }
	  }
	  public Users getEmployee() {
		  Users usr=new Users();
		  usr.setId(100);
		  usr.setName("ABC");
		  usr.setSalary(12000);
	  return usr;
	  }
	  public List<Users> listOfEmployee(){
		  List<Users> listOfEmp = new ArrayList<Users>();
			Users usr1 = new Users();
			usr1.setId(100);
			usr1.setName("ABC");
			usr1.setSalary(12000);
			
			Users usr2 = new Users();
			usr2.setId(200);
			usr2.setName("PQRS");
			usr2.setSalary(14000);
			listOfEmp.add(usr1);
			listOfEmp.add(usr2);
			
			return listOfEmp;
		}
	  public float passEmployeeObject(Users usr) {
		 
		  return usr.getSalary()+500;
	  }
}
