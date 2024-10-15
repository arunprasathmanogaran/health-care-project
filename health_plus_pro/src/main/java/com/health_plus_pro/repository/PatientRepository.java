package com.health_plus_pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.health_plus_pro.entity.Patient;
                //child                       parent
public interface PatientRepository extends JpaRepository<Patient, Long> {

}


//inheritance