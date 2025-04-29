package com.hrproject.hrbackend.service;

import com.hrproject.hrbackend.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee updatedEmployee);

    void deleteEmployee(Long id);
}