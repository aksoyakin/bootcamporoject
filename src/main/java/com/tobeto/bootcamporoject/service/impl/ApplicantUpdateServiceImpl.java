package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.core.mapper.ModelMapperService;
import com.tobeto.bootcamporoject.dataaccess.ApplicantRepository;
import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantUpdateRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantUpdateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApplicantUpdateServiceImpl implements ApplicantUpdateService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Applicant update(
            final Integer applicantId,
            final ApplicantUpdateRequest applicantUpdateRequest
    ) {
        final Applicant applicantEntityToBeUpdate = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantEntityToBeUpdate.setAbout(applicantUpdateRequest.getAbout());

        return applicantRepository.save(applicantEntityToBeUpdate);
    }
}
