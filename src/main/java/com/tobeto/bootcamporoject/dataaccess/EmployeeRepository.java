package com.tobeto.bootcamporoject.dataaccess;


import com.tobeto.bootcamporoject.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
