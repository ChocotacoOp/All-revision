package com.masai;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.masai.repo.EmployeeRepo;
import com.masai.service.EmpService;

//@RunWith()
@SpringBootTest
class Day10AssApplicationTests {

	@Autowired
	private EmpService eservice;
	
	@MockBean
	private EmployeeRepo erepo;
	
	@Test
	public void FindEmployeeById() {
		Integer empId =1;
		
	}

}
