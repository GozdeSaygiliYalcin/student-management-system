package com.gozdesy.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Table(name = "course_table")
public class Course {
	
	@Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long courseId;
	
    @Column(name = "course_name")
    private String courseName;
    
    @Column(name = "course_description")
    private String courseDescription;
    
    @ManyToMany(mappedBy = "courseList")
	private List<Student> studentList;
    
    @OneToMany(mappedBy = "course")
  	private List<Grade> gradeList;

}
