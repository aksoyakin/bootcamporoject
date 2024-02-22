package com.tobeto.bootcamporoject.webapi;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantCreateService applicantCreateService;


    @PostMapping
    public Applicant createApplicant(
            @RequestBody final ApplicantCreateRequest applicantCreateRequest
    ) {
        final Applicant createdApplicant = applicantCreateService.create(applicantCreateRequest);
        return createdApplicant;
    }


}
