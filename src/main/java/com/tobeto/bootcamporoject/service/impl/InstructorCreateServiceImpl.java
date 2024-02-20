package com.tobeto.bootcamporoject.service.impl;

import com.tobeto.bootcamporoject.core.mapper.ModelMapperService;
import com.tobeto.bootcamporoject.dataaccess.InstructorRepository;
import com.tobeto.bootcamporoject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Instructor;
import com.tobeto.bootcamporoject.service.InstructorCreateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InstructorCreateServiceImpl implements InstructorCreateService {
    private final InstructorRepository instructorRepository;
    private final ModelMapperService modelMapperService;
    @Override
    public Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    ) {
        final Instructor instructorToBeSave = modelMapperService.forRequest()
                .map(instructorCreateRequest,Instructor.class);

        return instructorRepository.save(instructorToBeSave);
    }
}
