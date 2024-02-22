package com.tobeto.bootcamporoject.service;

import com.tobeto.bootcamporoject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Employee;

public interface EmployeeCreateService {
    Employee create(
            final EmployeeCreateRequest employeeCreateRequest
    );
}
