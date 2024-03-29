package com.enfocareservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enfocareservice.entity.ConsultationEntity;

@Repository
public interface ConsultationRepository extends JpaRepository<ConsultationEntity, Long> {

	List<ConsultationEntity> findByDoctor(String doctor);

	List<ConsultationEntity> findByPatient(String patient);

}
