package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Exceptions.SpectacleIdNotFoundException;
import com.cg.model.Spectacles;
import com.cg.service.ISpectaclesService;

@RestController
@RequestMapping("spect/api/v1")
public class SpectacleController {
@Autowired
private ISpectaclesService ss;

// getting data from database
@GetMapping("/getAll")
public ResponseEntity<List<Spectacles>> getAllSpect(){
	List<Spectacles> spect= ss.getAllSpectacle();
	return new ResponseEntity<List<Spectacles>>(spect, HttpStatus.OK);
}

// add data in database
@SuppressWarnings({ "rawtypes", "unchecked" })
@PostMapping("/insert")
public ResponseEntity<Spectacles> InsertSpect(@RequestBody Spectacles spects){
	Spectacles spect= ss.addSpectacle(spects);
	if(spect==null) {
		return new ResponseEntity("Sorry! spectacle not inserted!", 
				HttpStatus.NOT_FOUND);
	}
	
	return new ResponseEntity<Spectacles>(spect, HttpStatus.OK);
}

// delete the field in database by considering spectaclesId
@DeleteMapping("/delete/{spectaclesId}")
public ResponseEntity<Spectacles> deleteSpect(
		@PathVariable("spectaclesId")Integer spectaclesId)throws SpectacleIdNotFoundException{
	Spectacles spect= ss.removeSpectacle(spectaclesId);
	return new ResponseEntity<Spectacles>(spect, HttpStatus.OK);
}

// get data from database for specific spectaclesId
@GetMapping("/view/{spectaclesId}")
public ResponseEntity<Spectacles> findSpect(
		@PathVariable("spectaclesId")Integer spectaclesId)throws SpectacleIdNotFoundException{
	Spectacles spect= ss.getSpectacle(spectaclesId);
	
	return new ResponseEntity<Spectacles>(spect, HttpStatus.OK);
}

// update data in database
@PutMapping("/update")
public ResponseEntity<Spectacles> updateSpect(
		 @RequestBody Spectacles spect){
	Spectacles spects=ss.updateSpectacle(spect);
	return new ResponseEntity<Spectacles>(spects, HttpStatus.OK);
}
}
