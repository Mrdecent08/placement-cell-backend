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

import com.example.demo.model.Result;
import com.example.demo.service.ResultService;

@CrossOrigin("*")
@RestController
@RequestMapping("result")
public class ResultController {

	ResultService resultService;

	public ResultController(ResultService resultService) {
		super();
		this.resultService = resultService;
	}

	@PostMapping()
	public ResponseEntity<Result> createResult(@RequestBody Result result) {
		return new ResponseEntity<Result> (resultService.saveResult(result),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Result> getAllResults(){
		return resultService.getAllResults();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Result> getResultById(@PathVariable int id){
		return new ResponseEntity<Result>(resultService.getResultById(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Result> updateResult(@PathVariable int id,@RequestBody Result result){
		return new ResponseEntity<Result>(resultService.updateResult(result,id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	 public ResponseEntity<Result> deleteResult(@PathVariable int id) {

        return new ResponseEntity<Result>(resultService.deleteResult(id),HttpStatus.OK);
    }
	
	
}
