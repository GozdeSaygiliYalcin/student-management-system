package com.gozdesy.dataaccessobjects;

import java.util.List;
import org.hibernate.Session;
import com.gozdesy.entity.Student;
import jakarta.persistence.TypedQuery;

public class StudentDao implements IRepository<Student> {

	@Override
	public void create(Student entity) {
		
		try {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Student data is added to Database");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("A problem is oocured while adding student data");
		}
	}

	@Override
	public void delete(long id) {
		Session session = null;
		try {
			Student deleteStudent = find(id);
			if(deleteStudent != null) {
				
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deleteStudent);
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
	public void update(long id, Student entity) {
		Session session = null;
		try {
			Student updateStudent = find(id);
			if(updateStudent != null) {				
				
				updateStudent.setFirstName(entity.getFirstName());
				updateStudent.setLastName(entity.getLastName());
				updateStudent.setAge(entity.getAge());
				updateStudent.setGender(entity.getGender());
				updateStudent.setAddress(entity.getAddress());
				updateStudent.setCourseList(entity.getCourseList());
		
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.merge(updateStudent);
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
		String hql = "SELECT usr FROM Student AS usr"; // usr * yerine all olarak getiriyor
		TypedQuery<Student> typedQuery = session.createQuery(hql, Student.class);
		List<Student> studentList = typedQuery.getResultList();
		
		for (Student user : studentList) {
			System.out.println(user);
		}
	}

	@Override
	public Student find(long id) {
		
		Session session = databaseConnectionHibernate();
		Student student = new Student();
		try {
			student = session.find(Student.class, id);
			
			if( student != null) {
				System.out.println("Student is found " + student);
				return student;
			}
			else {
				System.out.println("Student is not found");
				return student;
			}
			
		} catch (Exception e) {
			System.out.println("A problem has occured during the find operation");
			e.printStackTrace();
			
		} finally {
			session.close();
			}
		return null;
	}
	
	public void updateSubscription(long id, int payment) {
        Session session = null;
        try {
            Student updateStudent = find(id);
            if(updateStudent != null && updateStudent.getSubscription() >= payment) {

                updateStudent.setSubscription(updateStudent.getSubscription() - payment);

                session = databaseConnectionHibernate();
                session.getTransaction().begin();
                session.merge(updateStudent);
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
}
