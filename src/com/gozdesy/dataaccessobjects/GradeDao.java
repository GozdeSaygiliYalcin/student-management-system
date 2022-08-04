package com.gozdesy.dataaccessobjects;

import java.util.List;
import org.hibernate.Session;
import com.gozdesy.entity.Grade;
import jakarta.persistence.TypedQuery;

public class GradeDao implements IRepository<Grade> {

	@Override
    public void create(Grade entity) {

        Session session = null;
        try {

            session = databaseConnectionHibernate();
            session.getTransaction().begin();
            session.merge(entity);
            session.getTransaction().commit();
            System.out.println("User data is added to DB.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Some problem occured while adding user data.");
        } finally {
        	if (session != null) {
                session.close();
            }
        }
    }

	@Override
	public void delete(long id) {
		Session session = null;
		try {
			Grade deleteGrade = find(id);
			if(deleteGrade != null) {
				
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.remove(deleteGrade);
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
	public void update(long id, Grade entity) {
		Session session = null;
		try {
			Grade updateGrade = find(id);
			if(updateGrade != null) {				
				
				updateGrade.setGrade(entity.getGrade());
				updateGrade.setCourse(entity.getCourse());
		
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.merge(updateGrade);
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
		String hql = "SELECT usr FROM Grade AS usr"; // usr * yerine all olarak getiriyor
		TypedQuery<Grade> typedQuery = session.createQuery(hql, Grade.class);
		List<Grade> gradeList = typedQuery.getResultList();
		
		for (Grade user : gradeList) {
			System.out.println(user);
		}
	}

	@Override
	public Grade find(long id) {
		
		Session session = databaseConnectionHibernate();
		Grade grade = new Grade();
		try {
			grade = session.find(Grade.class, id);
			
			if( grade != null) {
				System.out.println("Grade is found " + grade);
				return grade;
			}
			else {
				System.out.println("Grade is not found");
				return grade;
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
