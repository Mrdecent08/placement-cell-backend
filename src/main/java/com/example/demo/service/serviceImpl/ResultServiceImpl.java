package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import com.example.demo.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{
	
	private ResultRepository resultRepository;

	public ResultServiceImpl(ResultRepository resultRepository) {
		super();
		this.resultRepository = resultRepository;
	}

	@Override
	public Result saveResult(Result result) {
		return resultRepository.save(result);
	}

	@Override
	public List<Result> getAllResults() {
		return resultRepository.findAll();
	}

	@Override
	public Result getResultById(int id) {
		return resultRepository.findById(id).get();
	}

	@Override
	public Result updateResult(Result result, int id) {
		Result existingResult = resultRepository.findById(id).get();
		existingResult.setCompanyName(result.getCompanyName());
		existingResult.setResultLink(result.getResultLink());
		existingResult.setDate(result.getDate());
		resultRepository.save(existingResult);
		return result;
	}

	@Override
	public Result deleteResult(int id) {
		Result existingResult = resultRepository.findById(id).get();
		resultRepository.deleteById(id);

		return existingResult;
	}

	
}
