package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Mobiles;

@RestController
public class MobileController {

	@Autowired
	MobileDao mobileDao;

	@GetMapping("/getAllMobiles")
	public List<Mobiles> getAllStudents() {
		return mobileDao.findAll();
	}

	@GetMapping("/getMobileBy/{Id}")
	public Optional<Mobiles> getMobileById(@PathVariable int Id) {
		return mobileDao.findById(Id);
	}

	@PostMapping("/saveMobileDetails")
	public String saveDetails(@RequestBody Mobiles m) {
		mobileDao.save(m);
		return "Details are saved";
	}

	@PutMapping("/updateMobileDetails")
	public void updateDetails(@RequestBody Mobiles m) {
		mobileDao.save(m);
	}

	@DeleteMapping("/deleteByMobileId/{Id}")
	public void deletebyId(@PathVariable int Id) {
		mobileDao.deleteById(Id);
	}

}
