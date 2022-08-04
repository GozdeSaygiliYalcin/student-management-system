package com.gozdesy.dataaccessobjects;

import java.util.List;
import org.hibernate.Session;
import com.gozdesy.entity.Course;
import jakarta.persistence.TypedQuery;

public class CourseDao implements IRepository<Course> {

	@Override
	public void create(Course entity) {
		
		try {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Course data is added to Database");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("A problem is oocured while adding course data");
		}
	}

	@Override
	public void delete(long id) {
		Session session = null;
		try {
			Course deleteCourse = find(id);
			if(deleteCourse != null) {
				
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deleteCourse);
				session.getTransaction().commit();

				System.out.println("Successfully deleted.");	
			}
			
		} catch (Exception e) {
		System.out.println("Some problem occured while DELETE opertaion.");
		e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void update(long id, Course entity) {
		Session session = null;
		try {
			Course updateCourse = find(id);
			if(updateCourse != null) {				
				
				updateCourse.setCourseName(entity.getCourseName());
				updateCourse.setCourseDescription(entity.getCourseDescription());
				updateCourse.setStudentList(entity.getStudentList());
		
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.merge(updateCourse);
				session.getTransaction().commit();
				System.out.println("Successfully updated. Welldone.");
			}
			
		} catch (Exception e) {
			System.out.println("Some problem has occured while UPDATE.");
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void listAll() {
		
		Session session = databaseConnectionHibernate();
		String hql = "SELECT usr FROM Course AS usr"; // usr * yerine all olarak getiriyor
		TypedQuery<Course> typedQuery = session.createQuery(hql, Course.class);
		List<Course> courseList = typedQuery.getResultList();
		
		for (Course user : courseList) {
			System.out.println(user);
		}
	}

	@Override
	public Course find(long id) {
		
		Session session = databaseConnectionHibernate();
		Course course = new Course();
		try {
			course = session.find(Course.class, id);
			
			if( course != null) {
				System.out.println("Course is found " + course);
				return course;
			}
			else {
				System.out.println("Course is not found");
				return course;
			}
			
		} catch (Exception e) {
			System.out.println("A problem has occured during the find operation");
			e.printStackTrace();
			
		} finally {
			session.close();
			}
		return null;
	}
}
