package com.tobeto.bootcamporoject.service;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;

public interface ApplicantUpdateService {
    Applicant update(
            final Integer applicantId,
            final ApplicantUpdateRequest applicantUpdateRequest
    );

}
