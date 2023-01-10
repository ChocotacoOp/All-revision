package com.masai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.masai.model.Employee;
import com.masai.repo.EmployeeRepo;
import com.masai.service.EmpService;

//@RunWith()
@SpringBootTest
class Day10AssApplicationTests {

	@Autowired
	private EmpService eservice;
	
	@MockBean
	private EmployeeRepo erepo;
	
//	@Test
//	public void FindEmployeeById() {
//		Integer empId =1;
//		when(erepo.findById(empId))
//		.thenReturn(Stream.of(new Employee(1,"rajat","khirpai")).collect(Collectors.toList())));
//		assertEquals(1, eservice.FindEmployeeById(empId).size());

		
//	}

}
