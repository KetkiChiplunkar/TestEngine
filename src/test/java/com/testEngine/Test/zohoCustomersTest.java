package com.testEngine.Test;

import org.testng.annotations.Test;

import com.testEngine.PageRepository.zohoCustomerPage;
import com.testEngine.testBase.Page;

public class zohoCustomersTest extends zohoCustomerPage {
	
	@Test
	public void zohoCustomerCount() throws Exception{
		clickCustomer();
		String getCount = getUsersCount();
		System.out.println("Customer Count is "+getCount);
		
		
	}

	
	

}
