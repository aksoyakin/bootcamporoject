package com.tobeto.bootcamporoject.model.dto.instructor.request;

import com.tobeto.bootcamporoject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
public class InstructorCreateRequest extends UserCreateRequest {

    private String companyName;
}
