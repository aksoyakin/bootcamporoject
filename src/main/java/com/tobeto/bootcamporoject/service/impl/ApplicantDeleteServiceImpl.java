package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.dataaccess.ApplicantRepository;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicantDeleteServiceImpl implements ApplicantDeleteService {

    private final ApplicantRepository applicantRepository;

    @Override
    public void delete(
            final Integer applicantId
    )
    {
        final Applicant applicantEntityToBeDelete = applicantRepository
                .findById(applicantId)
                .orElseThrow(() -> new RuntimeException("Bu id değerine sahip bir Applicant bulunamadı."));

        applicantRepository.delete(applicantEntityToBeDelete);
    }
}
