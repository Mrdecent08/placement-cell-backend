package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Statistics;
import com.example.demo.repository.StatisticsRepository;
import com.example.demo.service.StatisticsService;

@Service
public class StatisticsServiceImpl implements StatisticsService{
	
	private StatisticsRepository statisticsRepository;

	public StatisticsServiceImpl(StatisticsRepository statisticsRepository) {
		super();
		this.statisticsRepository = statisticsRepository;
	}

	@Override
	public Statistics saveStatistics(Statistics statistics) {
		return statisticsRepository.save(statistics);
	}

	@Override
	public List<Statistics> getAllStatisticss() {
		return statisticsRepository.findAll();
	}

	@Override
	public Statistics getStatisticsById(int id) {
		return statisticsRepository.findById(id).get();
	}

	@Override
	public Statistics updateStatistics(Statistics Statistics, int id) {
		Statistics existingStatistics = statisticsRepository.findById(id).get();
		existingStatistics.setTotal(Statistics.getTotal());
		existingStatistics.setCsm(Statistics.getCsm());
		existingStatistics.setCsd(Statistics.getCsd());
		existingStatistics.setEce(Statistics.getEce());
		existingStatistics.setChe(Statistics.getChe());
		existingStatistics.setCivil(Statistics.getCivil());
		existingStatistics.setMech(Statistics.getMech());
		existingStatistics.setIt(Statistics.getIt());
		existingStatistics.setCse(Statistics.getCse());
		statisticsRepository.save(existingStatistics);
		return Statistics;
	}

	@Override
	public Statistics deleteStatistics(int id) {
		Statistics existingStatistics = statisticsRepository.findById(id).get();
		statisticsRepository.deleteById(id);

		return existingStatistics;
	}

	
}
