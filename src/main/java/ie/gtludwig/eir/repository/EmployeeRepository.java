package ie.gtludwig.eir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ie.gtludwig.eir.model.Employee;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, String>{
	
	public List<Employee> getEmployeeListByLastName(String lastName);

}
