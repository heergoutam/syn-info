package com.synpulse.synformation.service;

import com.synpulse.synformation.entity.Employee;
import com.synpulse.synformation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee saveEmployees(List<Employee> employee) {
        return employeeRepository.save(employee.get(0));
    }

    public String deleteEmployee(String id) {
        employeeRepository.deleteById(id);
        return "employee removed !! " + id;
    }
}
