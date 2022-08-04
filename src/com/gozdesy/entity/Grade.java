package com.gozdesy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "grade_table")
public class Grade {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column(name = "grade_id")
	private long gradeId;
	
	private int grade;
	
	@ManyToOne
	@JoinColumn(name="course_name", referencedColumnName = "course_name")
	private Course course;
	
	@ManyToOne
	@JoinColumn(name="first_name", referencedColumnName = "first_name")
	@JoinColumn(name="last_name",referencedColumnName = "last_name")
	private Student student;
	
}	