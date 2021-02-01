package com.nt.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.nt.dto.PatientDto;
import com.nt.entity.Patient;
import com.nt.service.PatientServiceManager;
import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

@Controller
public class PatientController {

	@Autowired
	private PatientServiceManager service;
	static {
		System.out.println("pateint controller");
	}

	@RequestMapping(value = "/registerpatient.htm",method = RequestMethod.POST)
	public ModelAndView registerPatient(HttpServletRequest req) {
		String lvn = "patient-details";
		PatientDto dto = new PatientDto();
		dto.setPid(18);
		dto.setPname(req.getParameter("patientname"));
		dto.setAge(Integer.parseInt(req.getParameter("age")));
		dto.setGender(req.getParameter("gender"));
		dto.setPhoneNumber(req.getParameter("phonenumber"));
		dto.setAddress(req.getParameter("address"));
		Patient registerPatient = service.registerPatient(dto);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(lvn);
	    System.out.println(registerPatient);
		mav.addObject("patient" ,registerPatient);
		return mav;

	}
	@GetMapping("/getPatient.htm")
	public String getPatient(@RequestParam(name = "pid")String pid,Map<String,Object> map) {
		String lvn="patient-details";
		//String pid=webRequest.getParameter("pid");
		Patient patient = service.getPatientById(Integer.parseInt(pid));
		map.put("patient", patient);
		return lvn;
		
	}

}
