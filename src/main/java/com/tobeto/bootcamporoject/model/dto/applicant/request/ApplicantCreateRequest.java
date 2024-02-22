package com.tobeto.bootcamporoject.model.dto.applicant.request;

import com.tobeto.bootcamporoject.model.dto.user.request.UserCreateRequest;
import lombok.Getter;

@Getter
public class ApplicantCreateRequest extends UserCreateRequest {
    private String about;
}
