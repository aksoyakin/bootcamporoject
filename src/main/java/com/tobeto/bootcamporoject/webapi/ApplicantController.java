package com.tobeto.bootcamporoject.webapi;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantDeleteRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantCreateService;
import com.tobeto.bootcamporoject.service.ApplicantDeleteService;
import com.tobeto.bootcamporoject.service.ApplicantUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/applicants")
@RequiredArgsConstructor
public class ApplicantController {
    private final ApplicantCreateService applicantCreateService;
    private final ApplicantDeleteService applicantDeleteService;


    //create
    @PostMapping
    public Applicant createApplicant(
            @RequestBody final ApplicantCreateRequest applicantCreateRequest
    ) {
        final Applicant createdApplicant = applicantCreateService.create(applicantCreateRequest);
        return createdApplicant;
    }

    @DeleteMapping("/{applicantId}")
    public void deleteApplicant(
            @PathVariable("applicantId") final Integer applicantId
    ) {
        applicantDeleteService.delete(applicantId);
    }


}
