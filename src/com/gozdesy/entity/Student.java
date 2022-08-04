package com.gozdesy.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Table(name = "student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private long studentId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "age")
	private int age;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name = "subscription")
	private double subscription = 500;
	
	@ManyToMany
    @JoinTable(name="student_course_table", joinColumns = {@JoinColumn(name ="student_id")},inverseJoinColumns = {@JoinColumn(name="course_id")} )
	private List<Course> courseList;
	
	@ManyToOne
	@JoinColumn(name="country", referencedColumnName = "country")
	private Address address;
	
	@OneToMany(mappedBy = "student")
	private List<Grade> grade;
}
