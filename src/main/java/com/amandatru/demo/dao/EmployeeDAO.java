package com.amandatru.demo.dao;

import com.amandatru.demo.modal.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> get();

    Employee get(int id);

    void save(Employee employee);

    void delete(int id);
}
