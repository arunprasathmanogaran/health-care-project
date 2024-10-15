package com.health_plus_pro.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health_plus_pro.entity.Patient;
import com.health_plus_pro.repository.PatientRepository;

@RestController
public class PatientRestController {
	
	@Autowired
	private PatientRepository patRepo;
	
	//http://localhost:8080/list_all_pat_api
	@GetMapping("/list_all_pat_api")
	public List<Patient> getAllPatApi(Patient patient){
		
		List<Patient> pats = patRepo.findAll();
		
		return pats;
	}

	
	//http://localhost:8080/save_pat_api
	@PostMapping("/save_pat_api")
	public void savePatApi(@RequestBody Patient patient) {
		patRepo.save(patient);
		
	}
	
	//http://localhost:8080/update_pat_api
		@PutMapping("/update_pat_api")
		public void updatePatApi(@RequestBody Patient patient) {
			patRepo.save(patient);
		}

		
		//http://localhost:8080/delete_pat_api/7
	@DeleteMapping("/delete_pat_api/{id}")                                                           // path para	
public void deletePatApi(@PathVariable("id")long id) {
		
		patRepo.deleteById(id);                                                                          //hib meth
	
}
		
}


