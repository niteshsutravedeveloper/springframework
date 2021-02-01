package com.ds.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ds.formObject.DoctorForm;
import com.nt.dto.DoctorDto;
import com.nt.projection.DoctorProjection;
import com.nt.service.DoctorServiceManager;

@Controller
public class DoctorManagerContoller {
	@Autowired
private DoctorServiceManager service;
	static {
		System.out.println("in controller");
	}
	@PostMapping(value = "/savedoctor.htm")
	public String persistDoctor(@ModelAttribute DoctorForm df,Map<String,Object> map) {
		String lvn="doctor_registraton_detail";
		DoctorDto dto=null;
		dto=this.getDoctorDto(df);
		DoctorDto doctorDto = service.saveDoctor(dto);
		map.put("doctor", doctorDto);
		return lvn;
	}
	private DoctorDto getDoctorDto(DoctorForm df) {
		DoctorDto dto=new DoctorDto(null,df.getDoctorName(),df.getAge(),df.getSpecialist(),df.getAddress(),df.getExperience(),df.getPhoneNumber());
		return dto;
	}
	@GetMapping(value = "/getdoctors.htm")
	public String getDoctors(Map<String,Object> map) {
		String lvn="all_doctors";
		List<DoctorDto> doctorsList= service.getDoctorsList();
		/*
		 * ModelAndView mav=new ModelAndView(); mav.setViewName("doctorslist");
		 * mav.addObject(doctorsList);
		 */
		map.put("doctorslist", doctorsList);
		
		return lvn;
	}
	@GetMapping(value = "/{doctorId}/getdoctor.htm")
	public String findDoctorById(@PathVariable("doctorId") int id,Map<String ,Object> map) {
		String lvn="doctor_detail";
		DoctorDto doctorDto = service.getDoctorById(id);
		map.put("doctor",doctorDto);
		return lvn;
	}
	
}
