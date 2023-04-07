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

import com.example.demo.model.Statistics;
import com.example.demo.service.StatisticsService;

@CrossOrigin("*")
@RestController
@RequestMapping("stats")
public class StatisticsController {
	
	private StatisticsService statisticsService;

	public StatisticsController(StatisticsService statisticsService) {
		super();
		this.statisticsService = statisticsService;
	}

	@PostMapping()
	public ResponseEntity<Statistics> createStatistics(@RequestBody Statistics Statistics) {
		return new ResponseEntity<Statistics> (statisticsService.saveStatistics(Statistics),HttpStatus.CREATED);
	}
	
	@GetMapping()
	public List<Statistics> getAllStatisticss(){
		return statisticsService.getAllStatisticss();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Statistics> getStatisticsById(@PathVariable int id){
		return new ResponseEntity<Statistics>(statisticsService.getStatisticsById(id),HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Statistics> updateStatistics(@PathVariable int id,@RequestBody Statistics Statistics){
		return new ResponseEntity<Statistics>(statisticsService.updateStatistics(Statistics,id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	 public ResponseEntity<Statistics> deleteStatistics(@PathVariable int id) {

        return new ResponseEntity<Statistics>(statisticsService.deleteStatistics(id),HttpStatus.OK);
    }
	
}
