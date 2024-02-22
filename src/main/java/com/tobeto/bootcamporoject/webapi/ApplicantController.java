package com.tobeto.bootcamporoject.webapi;

import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantDeleteRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantCreateService;
import com.tobeto.bootcamporoject.service.ApplicantDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerTemplateAvailabilityProvider;
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

    //delete
    @DeleteMapping
    public void deleteApplicant(@RequestBody ApplicantDeleteRequest applicantDeleteRequest){
        applicantDeleteService.delete(applicantDeleteRequest);
    }


}
