package com.example.demo.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		return null;
	}

	@Override
	public Student updateStudent(Student student, int id) {
		// TODO Auto-generated method stub
		Student existingStudent = studentRepository.findById(id).get();
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setRollNo(student.getRollNo());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPassword(student.getPassword());
		existingStudent.setCourse(student.getCourse());
		existingStudent.setBranch(student.getBranch());
		existingStudent.setYear(student.getYear());
		existingStudent.setSsc(student.getSsc());
		existingStudent.setSscp(student.getSscp());
		existingStudent.setHsc(student.getHsc());
		existingStudent.setHscp(student.getHscp());
		existingStudent.setUg(student.getUg());
		existingStudent.setUgp(student.getUgp());
		existingStudent.setBacklogs(student.getBacklogs());
		existingStudent.setDob(student.getDob());
		existingStudent.setLinkedIn(student.getLinkedIn());
		existingStudent.setNationality(student.getNationality());
		existingStudent.setPhone(student.getPhone());
		existingStudent.setRole(student.getRole());
		studentRepository.save(existingStudent);

		return student;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		Student existingStudent = studentRepository.findById(id).get();
		studentRepository.deleteById(id);

		return existingStudent;
	}
	
	
}
