package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Drive;
import com.example.demo.service.DriveService;


@CrossOrigin("*")
@RestController
@RequestMapping("/drive")
public class DriveController {

	private DriveService driveService;

	public DriveController(DriveService driveService) {
		super();
		this.driveService = driveService;
	}
	
	@PostMapping()
	public ResponseEntity<Drive> createDrive(@RequestBody Drive drive) {
		return new ResponseEntity<Drive> (driveService.saveDrive(drive),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Drive> getAllStudents(){
		return driveService.getAllDrives();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Drive> getDriveById(@PathVariable int id){
		return new ResponseEntity<Drive>(driveService.getDriveById(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Drive> updateDrive(@PathVariable int id,@RequestBody Drive drive){
		return new ResponseEntity<Drive>(driveService.updateDrive(drive,id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	 public ResponseEntity<Drive> deleteDrive(@PathVariable int id) {

        return new ResponseEntity<Drive>(driveService.deleteDrive(id),HttpStatus.OK);
    }
}
