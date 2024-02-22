package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.core.mapper.ModelMapperService;
import com.tobeto.bootcamporoject.dataaccess.ApplicantRepository;
import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ApplicantCreateServiceImpl implements ApplicantCreateService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;

    @Override
    public Applicant create(
            final ApplicantCreateRequest applicantCreateRequest)
    {
        final Applicant applicantToBeSave = modelMapperService.forRequest()
                .map(applicantCreateRequest, Applicant.class);

        return applicantRepository.save(applicantToBeSave);
    }
}
