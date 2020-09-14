package com.amandatru.demo.service;

import com.amandatru.demo.modal.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}