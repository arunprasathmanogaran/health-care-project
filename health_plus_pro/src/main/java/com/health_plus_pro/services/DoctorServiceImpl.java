package com.health_plus_pro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health_plus_pro.entity.Doctor;
import com.health_plus_pro.repository.DoctorRepository;

@Service                             //inheritance
public class DoctorServiceImpl implements DoctorService {
	
	//dependency injection
	  @Autowired
      private DoctorRepository doctorRepo;
	
	@Override
	public void saveDoctorData(Doctor doctor) {
		
    doctorRepo.save(doctor);
	
	}

	@Override   // polymorphism
	public List<Doctor> getAllData(Doctor doctor) {
      
		List<Doctor> doctors = doctorRepo.findAll();
		return doctors;
	}

	@Override
	public void deleteOneDoctor(long id) {
		
		doctorRepo.deleteById(id);
		
	}

	@Override
	public Doctor updateOneDoctor(long id) {
		Optional<Doctor> findById = doctorRepo.findById(id);
		
		Doctor doctor1 = findById.get();
		
		return doctor1;
	}

	@Override
	public void updateDrdata(Doctor doctor) {
		doctorRepo.save(doctor);
		
	}

}


//hib meth
//inheritance