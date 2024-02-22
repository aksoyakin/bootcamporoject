package com.tobeto.bootcamporoject.service;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;

public interface ApplicantCreateService {
    Applicant create(
            final ApplicantCreateRequest applicantCreateRequest
    );
}
