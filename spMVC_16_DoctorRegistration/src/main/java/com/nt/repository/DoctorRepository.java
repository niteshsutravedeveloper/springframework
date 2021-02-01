package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.dto.DoctorDto;
import com.nt.entity.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{
	@Query("select d from Doctor d  ")
	public List<Doctor> getALlDoctors();

}
