package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Drive;

public interface DriveService {

	Drive saveDrive(Drive drive);

	List<Drive> getAllDrives();

	Drive getDriveById(int id);

	Drive updateDrive(Drive drive, int id);

	Drive deleteDrive(int id);

}
