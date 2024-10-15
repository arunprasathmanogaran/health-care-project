package com.health_plus_pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.health_plus_pro.entity.Doctor;
import com.health_plus_pro.entity.Patient;
import com.health_plus_pro.repository.DoctorRepository;
import com.health_plus_pro.services.DoctorService;
import com.health_plus_pro.services.PatientService;
import com.health_plus_pro.util.DoctorEmailService;
import com.health_plus_pro.util.PatientEmailService;

@Controller
public class DoctorController {
	
	
	@Autowired
	private DoctorService doctorService;

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private DoctorEmailService drEmailServ;
	
	@Autowired
	private PatientEmailService patEmailServ;
	
	//http://localhost:8080/new_reg
	@RequestMapping("new_reg")
	public String show() {
		
		return"doctor_reg";
}
	
	
	@RequestMapping("/savedoctor")
	public String savedoctor(Doctor doctor) {
		
		doctorService.saveDoctorData(doctor);
		
		drEmailServ.sendDocEmail(doctor.getEmail(),"Welcome","Congratulations Doctor" );
		return"doctor_reg";
	}
	
	//http://localhost:8080/newpat                                                                    //formload  browser
	@RequestMapping("/newpat")     
	public String newpat() {
		
		return"pat_reg";
	}
	
	//savepatient
	@RequestMapping("/savepatient")
	public String savepatient(Patient patient) {
		                                                                                               //javadatacon-addressdatastored
		patientService.savePatientData(patient);
		
		patEmailServ.sendPatEmail(patient.getEmail(),"your are register in health care","thankyou");
		
		
		return"pat_reg";
	}
	
	//http://localhost:8080/listallpat
	@RequestMapping("/listallpat")
	public String listAllPat(Patient patient ,Model model) {
		List<Patient> patients = patientService.getAllData(patient);
	model.addAttribute("patients",patients);
		return"list_all_pat";                                                                         //jsp file
}
@RequestMapping("/listalldoctor")
	public String getAllDoctorsData(Doctor doctor,Model model) {

	List<Doctor> doctors = doctorService.getAllData(doctor);
	model.addAttribute("doctors",doctors);
		return"list_all_doctors"; 
}

//deletepat
@RequestMapping("/deletepat")
public String deletepat(@RequestParam("id")long id,Patient patient,Model model) {
	patientService.deleteOnePat(id);
	
	List<Patient> patients = patientService.getAllData(patient);
	model.addAttribute("patients",patients);
		return"list_all_pat";
}

//deletedoctor
@RequestMapping("/deletedoctor")
public String deletedoctor(@RequestParam("id")long id,Doctor doctor,Model model) {
	
	doctorService.deleteOneDoctor(id);
	List<Doctor> doctors = doctorService.getAllData(doctor);
	model.addAttribute("doctors",doctors);
		return"list_all_doctors";
}


//updatepat
@RequestMapping("/updatepat")
public String updatepat(@RequestParam("id")long id,ModelMap model) {
	
	Patient patient1 = patientService.updateOnePat(id);                                                               //patientService
	model.addAttribute("patient1",patient1);
	return"update_pat";                                                                                //same to pat reg
}

//updatepatient
@RequestMapping("/updatepatient")
public String updatepatient(Patient patient,ModelMap model) {
	
	patientService.updateOnePat(patient);
	
	List<Patient> patients = patientService.getAllData(patient);
	model.addAttribute("patients",patients);
		return"list_all_pat";
	
}

//updatedoctor

@RequestMapping("/updatedoctor")
public String updatedoctor(@RequestParam("id")long id,ModelMap model) {
	
	Doctor doctor1 = doctorService.updateOneDoctor(id);
	model.addAttribute("doctor1",doctor1);
	
	return"update_doctor";                                                                                //same to pat reg
}

//updatedr
@RequestMapping("/updatedr")
public String updatedr(Doctor doctor,ModelMap model) {
	
	doctorService.updateDrdata(doctor);
	

	List<Doctor> doctors = doctorService.getAllData(doctor);
	model.addAttribute("doctors",doctors);
		return"list_all_doctors"; 
	
	
}



}


// our writing meth