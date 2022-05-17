package com.luan.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luan.entitiy.Student;
import com.luan.repository.StudentRepository;
import com.luan.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	};
}
