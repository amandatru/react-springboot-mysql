package com.amandatru.demo.service;


import java.util.List;

import com.amandatru.demo.dao.EmployeeDAO;
import com.amandatru.demo.modal.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDao;

    @Transactional
    @Override
    public List<Employee> get() {
        return employeeDao.get();
    }

    @Transactional
    @Override
    public Employee get(int id) {
        return employeeDao.get(id);
    }

    @Transactional
    @Override
    public void save(Employee employee) {
        employeeDao.save(employee);

    }

    @Transactional
    @Override
    public void delete(int id) {
        employeeDao.delete(id);

    }
}