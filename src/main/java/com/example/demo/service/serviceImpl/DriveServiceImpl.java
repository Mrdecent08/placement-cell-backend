package com.example.demo.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Drive;
import com.example.demo.repository.DriveRepository;
import com.example.demo.service.DriveService;

@Service
public class DriveServiceImpl implements DriveService{

		
	private DriveRepository driveRepository;
	
	public DriveServiceImpl(DriveRepository driveRepository) {
		super();
		this.driveRepository = driveRepository;
	}

	@Override
	public Drive saveDrive(Drive drive) {
		return driveRepository.save(drive);
	}

	@Override
	public List<Drive> getAllDrives() {
		return driveRepository.findAll();
	}

	@Override
	public Drive getDriveById(int id) {
		Optional<Drive> drive = driveRepository.findById(id);
		if(drive.isPresent()) {
			return drive.get();
		}
		return null;
	}

	@Override
	public Drive updateDrive(Drive drive, int id) {
		Drive existingDrive = driveRepository.findById(id).get();
		existingDrive.setCompanyName(drive.getCompanyName());
		existingDrive.setPackages(drive.getPackages());
		existingDrive.setReferenceLinks(drive.getReferenceLinks());
		existingDrive.setRoles(drive.getRoles());
		existingDrive.setStatus(drive.getStatus());
		existingDrive.setBacklogs(drive.getBacklogs());
		existingDrive.setCutoff_percent(drive.getCutoff_percent());
		existingDrive.setBranches(drive.getBranches());
		existingDrive.setDate(drive.getDate());
		driveRepository.save(existingDrive);
		return null;
	}

	@Override
	public Drive deleteDrive(int id) {
		// TODO Auto-generated method stub
		Drive exisitingDrive = driveRepository.findById(id).get();
		driveRepository.deleteById(id);

		return exisitingDrive;
	}

}
