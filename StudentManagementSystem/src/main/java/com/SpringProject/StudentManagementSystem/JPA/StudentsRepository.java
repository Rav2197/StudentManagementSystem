package com.SpringProject.StudentManagementSystem.JPA;

import com.SpringProject.StudentManagementSystem.StudentService.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Integer> {

}
