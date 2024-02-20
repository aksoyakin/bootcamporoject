package com.tobeto.bootcamporoject.dataaccess;

import com.tobeto.bootcamporoject.model.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {
}
