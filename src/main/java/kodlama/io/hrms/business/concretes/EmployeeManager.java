package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.dataAccess.abstracts.EmployeeDao;
import kodlama.io.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao ;
	
	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	

}
