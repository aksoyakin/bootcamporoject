package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.core.mapper.ModelMapperService;
import com.tobeto.bootcamporoject.dataaccess.ApplicantRepository;
import com.tobeto.bootcamporoject.model.dto.applicant.request.ApplicantDeleteRequest;
import com.tobeto.bootcamporoject.model.entities.Applicant;
import com.tobeto.bootcamporoject.service.ApplicantDeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicanDeleteServiceImpl implements ApplicantDeleteService {
    private final ApplicantRepository applicantRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public void delete(
            final ApplicantDeleteRequest applicantDeleteRequest)
    {
         applicantRepository.deleteById(applicantDeleteRequest.getId());
    }
}
