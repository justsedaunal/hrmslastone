package kodlama.io.hrms.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.EmployeeService;
import kodlama.io.hrms.entities.concretes.Employee;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
    }

    @PostMapping("/save")
    public void add(@Valid @RequestBody Employee employee){
        this.employeeService.add(employee);
    }
}