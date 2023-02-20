package com.SpringProject.StudentManagementSystem.JPA;

import com.SpringProject.StudentManagementSystem.StudentService.Courses;
import com.SpringProject.StudentManagementSystem.StudentService.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses ,Integer> {

}
