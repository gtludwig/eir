package ie.gtludwig.eir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ie.gtludwig.eir.model.Employee;
import ie.gtludwig.eir.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value = "/last_name/{lastName}",method = RequestMethod.GET)
	public List<Employee> getEmployeeByLastName(@PathVariable(value = "lastName") String lastName) {
		
		List<Employee> employeeList= employeeRepository.getEmployeeListByLastName(lastName);
		if (employeeList != null) {
			System.out.println(employeeList);
//			return new ResponseEntity<Employee> (HttpStatus.NOT_FOUND);
		}
		return employeeList;
	}

}
