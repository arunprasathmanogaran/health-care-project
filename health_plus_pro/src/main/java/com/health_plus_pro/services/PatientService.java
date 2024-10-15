package com.health_plus_pro.services;

import java.util.List;

import com.health_plus_pro.entity.Patient;

public interface PatientService {
	
	public void savePatientData(Patient patient);
	public List<Patient> getAllData(Patient patient);  // collection.
	public void deleteOnePat(long id);
	public Patient updateOnePat(long id);
	public void updateOnePat(Patient patient);                                //return ent class ret type

}










//data abstraction