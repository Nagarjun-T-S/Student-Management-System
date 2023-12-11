package com.alpha.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alpha.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public void run(String... args) throws Exception {

//		Student student1=new Student("Arjun","gowda","Arjungowda@gmail.com");
//		studentrepository.save(student1);
//		
//		Student student2=new Student("chandan","gowda","chandangowda@gmail.com");
//		studentrepository.save(student2);
//		
//		Student student3=new Student("shanthamurthy","gowda","shanthamurthygowda@gmail.com");
//		studentrepository.save(student3);
		
	}

}
