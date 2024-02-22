package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.core.mapper.ModelMapperService;
import com.tobeto.bootcamporoject.dataaccess.EmployeeRepository;
import com.tobeto.bootcamporoject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Employee;
import com.tobeto.bootcamporoject.service.EmployeeCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeCreateServiceImpl implements EmployeeCreateService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Employee create(
            EmployeeCreateRequest employeeCreateRequest)
    {
        final Employee employeeToBeSave = modelMapperService.forRequest()
                .map(employeeCreateRequest,Employee.class);

        return employeeRepository.save(employeeToBeSave);
    }
}
