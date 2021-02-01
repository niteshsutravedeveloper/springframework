package com.nt.service;

import java.util.Optional;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dto.PatientDto;
import com.nt.entity.Patient;
import com.nt.repository.CoronaPatientRepository;

@Service
public class PatientServiceManager {
	static {
		System.out.println("patient service");
	}
	@Autowired
	private CoronaPatientRepository repository;
@Transactional(readOnly = false)
	public Patient registerPatient(PatientDto dto) {
		Patient entity = this.getPatient(dto);
		Patient savedObject = repository.save(entity);
		return savedObject; 
	}
	@Transactional(readOnly = true)
	public Patient getPatientById(int id) {
		Patient p=null;
		Optional<Patient> findById = repository.findById(id);
		if(findById.isPresent())
			p=findById.get();
		
		return p;
	}
	private Patient getPatient(PatientDto dto) {
		Patient p=new Patient();
		BeanUtils.copyProperties(dto, p);
		return p;
	}

}
