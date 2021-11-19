package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import kodlama.io.hrms.entities.concretes.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
}