package com.tobeto.bootcamporoject.model.dto.employee.request;

import com.tobeto.bootcamporoject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class EmployeeCreateRequest extends UserCreateRequest {
    private String position;
}
