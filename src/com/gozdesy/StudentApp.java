package com.gozdesy;

import java.util.ArrayList;
import java.util.List;

import com.gozdesy.dataaccessobjects.AddressDao;
import com.gozdesy.dataaccessobjects.CourseDao;
import com.gozdesy.dataaccessobjects.GradeDao;
import com.gozdesy.dataaccessobjects.StudentDao;
import com.gozdesy.entity.Address;
import com.gozdesy.entity.Course;
import com.gozdesy.entity.Gender;
import com.gozdesy.entity.Grade;
import com.gozdesy.entity.Student;

public class StudentApp {
	
	List<Student> courseList;
	
	public void initMenu() {
		System.out.println("Enter choice between 1 - 5 : \n1 to save student \n2 to get student by id \n3 to get all the student \n4 to update student \n5 to delete student \n6 to exit");
        System.out.println("Enter your choice :");
	}
	
	public void studentCreate() {
	
	    courseList = new ArrayList<>();
	
	    Student student1 = new Student();
	    Address address1 = new Address();
	    address1.setCountry("turkey");
	    address1.setZipCode("34485");
	    
	    student1.setFirstName("Gozde");
	    student1.setLastName("Saygili");
	    student1.setAge(32);
	    student1.setGender(Gender.WOMAN);
	    courseList.add(student1);
	    student1.setAddress(address1);  
//--------------------------------------------------------//
	    Student student2 = new Student();
	    Address address2 = new Address();
	    address2.setCountry("usa");
	    address2.setZipCode("34485");
	    
	    student2.setFirstName("Boncuk");
	    student2.setLastName("Saygili");
	    student2.setAge(54);
	    student2.setGender(Gender.OTHER);
	    courseList.add(student2);
	    student2.setAddress(address2);
        
        Course course = new Course();
        course.setCourseName("java");
        course.setCourseDescription("boncuk should learn java");
        
        Grade grade = new Grade();
        grade.setCourse(course);
        grade.setGrade(90);
    	grade.setStudent(student1);
//--------------------------------------------------------//       
        AddressDao addressDao = new AddressDao();
	    addressDao.create(address1);
	    addressDao.create(address2);
	    
	    StudentDao studentDao = new StudentDao();
        studentDao.create(student1);
        studentDao.create(student2);
        
        CourseDao courseDao = new CourseDao();
        courseDao.create(course); 
	    
        GradeDao gradeDao = new GradeDao();
        gradeDao.create(grade);


	}
	
	public void viewStudent() {
		
	}
	
	public void openCourse() {
		
	}

	
//	 System.out.println( "Project Started......." );
//     boolean isTrue = true;
//     
//		Scanner input = new Scanner(System.in);
//     while(isTrue) {	
//     	
//         System.out.println("Enter choice between 1 - 5 : \n1 to save student \n2 to get student by id \n3 to get all the student \n4 to update student \n5 to delete student \n6 to exit");
//         System.out.println("Enter your choice :");
//         int choice = input.nextInt();
//     	switch (choice) {
//			case 1:
//				StudentDao.createStudent();
//				break;
//			case 2:
//				StudentDao.getStudentById();
//				break;
//			case 3:
//				StudentDao.getAllStudents();
//				break;
//			case 4:
//				StudentDao.updateStudent();
//				break;
//			case 5:
//				StudentDao.deleteStudent();
//				break;
//			case 6:
//				StudentDao.closeSessionFactory();
//				System.out.println("Project has been ended.......");
//				isTrue = false;
//				break;
//			default:
//				System.out.println("Please enter choice between 1 - 6");
//				
//			}
//     	
     	
     }

