package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Result;

public interface ResultService {

	Result saveResult(Result result);

	List<Result> getAllResults();

	Result getResultById(int id);

	Result updateResult(Result result, int id);

	Result deleteResult(int id);

}
