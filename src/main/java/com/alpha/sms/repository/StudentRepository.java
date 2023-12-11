 package com.alpha.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
