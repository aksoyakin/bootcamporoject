package com.tobeto.bootcamporoject.service;

import com.tobeto.bootcamporoject.model.dto.instructor.request.InstructorCreateRequest;
import com.tobeto.bootcamporoject.model.entities.Instructor;

public interface InstructorCreateService {
    Instructor create(
            final InstructorCreateRequest instructorCreateRequest
    );
}
