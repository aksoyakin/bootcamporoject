package com.tobeto.bootcamporoject.service;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantDeleteRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;

public interface ApplicantDeleteService {
    void delete(
            final ApplicantDeleteRequest applicantDeleteRequest
    );
}
