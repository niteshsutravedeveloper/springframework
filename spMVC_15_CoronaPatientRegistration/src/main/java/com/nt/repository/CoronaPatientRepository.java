package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Patient;

public interface CoronaPatientRepository extends JpaRepository<Patient,Integer>{

}
