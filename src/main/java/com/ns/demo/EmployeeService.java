package com.ns.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeService {
       private final EmployeeRepository repository;

       @Transactional
       public void saveEmployeeToDatabase(Employee employee){
           repository.save(employee);
       }

    @Transactional(readOnly = true)
    public List<Employee> findAll(){
        return repository.findAll();
    }
}
