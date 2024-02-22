package com.tobeto.bootcamporoject.model.dto.applicant.request;

import com.tobeto.bootcamporoject.model.dto.user.request.UserDeleteRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApplicantDeleteRequest extends UserDeleteRequest {
    private String about;
}
