package com.gozdesy.dataaccessobjects;

import java.util.List;
import org.hibernate.Session;
import com.gozdesy.entity.Address;
import jakarta.persistence.TypedQuery;

public class AddressDao implements IRepository<Address> {

	@Override
	public void create(Address entity) {
		
		try {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			System.out.println(session);
			session.merge(entity);
			session.getTransaction().commit();
			System.out.println("Address data is added to Database");
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("A problem is oocured while adding student data");
		}
	}

	@Override
	public void delete(long id) {
		Session session = null;
		try {
			Address deleteStudent = find(id);
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
	public void update(long id, Address entity) {
		Session session = null;
		try {
			Address updateAddress = find(id);
			if(updateAddress != null) {				
				
				updateAddress.setCountry(entity.getCountry());
                updateAddress.setZipCode(entity.getZipCode());
                updateAddress.setStudentList(entity.getStudentList());
		
				session = databaseConnectionHibernate();
				session.getTransaction().begin();
				session.merge(updateAddress);
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
		String hql = "SELECT usr FROM Address AS usr"; // usr * yerine all olarak getiriyor
		TypedQuery<Address> typedQuery = session.createQuery(hql, Address.class);
		List<Address> addressList = typedQuery.getResultList();
		
		for (Address user : addressList) {
			System.out.println(user);
		}
	}

	@Override
	public Address find(long id) {
		
		Session session = databaseConnectionHibernate();
		Address address = new Address();
		try {
			address = session.find(Address.class, id);
			
			if( address != null) {
				System.out.println("Address is found " + address);
				return address;
			}
			else {
				System.out.println("Address is not found");
				return address;
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
