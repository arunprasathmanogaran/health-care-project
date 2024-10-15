package com.health_plus_pro.services;

import java.util.List;

import com.health_plus_pro.entity.Doctor;


public interface DoctorService  {

	public void saveDoctorData(Doctor doctor);
	public List<Doctor> getAllData(Doctor doctor);
	public void deleteOneDoctor(long id);
	public Doctor updateOneDoctor(long id);
	public void updateDrdata(Doctor doctor);// save
}









// data abstraction