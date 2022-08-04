package com.gozdesy;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gozdesy.dataaccessobjects.StudentDao;
import com.gozdesy.utils.HibernateSession;

public class Test {
	
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        StudentApp sms = new StudentApp();

        sms.initMenu();
        System.out.println("Please enter a number");
        int a = input.nextInt();

        switch (a) {
        case 1: 
            sms.studentCreate();
        case 2:
            System.out.println("Please enter the student id:");
            long studentId = input.nextLong();
            System.out.println("Please enter that you want to amount of pay:");
            int payment = input.nextInt();

            StudentDao updateDao = new StudentDao();
            updateDao.updateSubscription(studentId, payment);
            break;
    
        }
	}
}
