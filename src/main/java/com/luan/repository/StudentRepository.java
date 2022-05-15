package com.luan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.entitiy.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
