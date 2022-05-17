package com.luan;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.luan.entitiy.Student;
import com.luan.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Luan", "Alves", "luan@hotmail.com");
		Student student2 = new Student("Maria", "Joana", "mj@hotmail.com");
		Student student3 = new Student("Estefane", "Macedo", "est@hotmail.com");
		studentRepository.saveAll(Arrays.asList(student1,student2,student3));
		
	}

}
