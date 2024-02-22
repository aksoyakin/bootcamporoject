package com.tobeto.bootcamporoject.webapi;

import com.tobeto.bootcamporoject.model.dto.employee.request.EmployeeCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Employee;
import com.tobeto.bootcamporoject.service.EmployeeCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeCreateService employeeCreateService;

    @PostMapping
    public Employee createEmployee(
            @RequestBody final EmployeeCreateRequest employeeCreateRequest
            )
    {
        final Employee createdEmployee = employeeCreateService.create(employeeCreateRequest);
        return createdEmployee;

    }
}
