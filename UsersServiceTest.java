package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bean.Users;
import com.service.UsersService;

class UsersServiceTest {
	@Test
	@DisplayName("Check user details testing")
void testCheckUser() {
	//fail("Not yet implemented");
	UsersService es = new UsersService();
	String result = es.checkUser("abc@gmail.com", "123");
	assertEquals("success", result);	
	String result1 = es.checkUser("pqrs@gmail.com", "123");
	assertEquals("failure", result1);
}
@Test
void testGetEmployee() {
	//fail("Not yet implemented");
	UsersService es = new UsersService();
	Users usr = es.getEmployee();
	assertNotNull(usr);
	assertEquals(100, usr.getId());
	assertEquals("ABC", usr.getName());
	assertEquals(12000, usr.getSalary());
}
@Test
void testListOfEmployee() {
	//fail("Not yet implemented");
	UsersService es = new UsersService();
	List<Users> listOfEmp = es.listOfEmployee();
	assertEquals(2, listOfEmp.size());
}
@Test
//@Disable(means it is not testing)this method
void testPassEmployeeObject() {
UsersService es = new UsersService();
	Users usr = new Users();
	usr.setId(100);
	usr.setName("ABC");
	usr.setSalary(12000);
	float updatedSalary =es.passEmployeeObject(usr);
	assertEquals(12500, updatedSalary);
}
	

	
}
