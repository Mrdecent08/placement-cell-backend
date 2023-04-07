package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Statistics;

public interface StatisticsService {

	Statistics saveStatistics(Statistics statistics);

	List<Statistics> getAllStatisticss();

	Statistics getStatisticsById(int id);

	Statistics updateStatistics(Statistics statistics, int id);

	Statistics deleteStatistics(int id);

}
