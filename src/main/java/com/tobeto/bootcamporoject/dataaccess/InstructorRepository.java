package com.tobeto.bootcamporoject.dataaccess;

import com.tobeto.bootcamporoject.model.entities.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}
