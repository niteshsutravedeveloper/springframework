package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.Doc;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dto.DoctorDto;
import com.nt.entity.Doctor;
import com.nt.projection.DoctorProjection;
import com.nt.repository.DoctorRepository;

@Service
public class DoctorServiceManager {
	@Autowired
	private DoctorRepository repository;

	@Transactional(readOnly = false)
	public DoctorDto saveDoctor(DoctorDto dto) {
		DoctorDto persitedDto = new DoctorDto();
		Doctor entity = new Doctor();
		Doctor persDoctor = null;
		BeanUtils.copyProperties(dto, entity);
		entity.setDoctorId(1);
		persDoctor = repository.save(entity);
		BeanUtils.copyProperties(persDoctor, persitedDto);
		return persitedDto;
	}

	@Transactional(readOnly = false)
	public List<DoctorDto> getDoctorsList() {
		
  List<Doctor> allDoctorsList = repository.getALlDoctors();
  
		List<DoctorDto> allDoctorsDtoList = allDoctorsList.stream().map((doctor)->{
			DoctorDto dto=new DoctorDto();
			BeanUtils.copyProperties(doctor, dto);
			System.out.println(dto);
		return dto;	
		}).collect(Collectors.toList());
		
		return allDoctorsDtoList;
	}
	@Transactional(readOnly = false)
	public DoctorDto getDoctorById(int id) {
		DoctorDto dto=null;
		Doctor doctor=null;
		Optional<Doctor> optional = repository.findById(id);
		if(optional.isPresent()) {
	 doctor = optional.get();
	 dto=new DoctorDto();
	 BeanUtils.copyProperties(doctor, dto);
		}
		return dto;
			
	}
}
