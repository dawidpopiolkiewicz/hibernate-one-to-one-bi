package pl.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.hibernate.entity.Address;
import pl.hibernate.entity.User;

public class AppMain {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			System.out.println("Creating new user...");

			User theUser = new User("Elen", "Husk");
			Address theAddress = new Address("Miedziana 13/13", "Gdansk", "80-001");

			theUser.setAddress(theAddress);

			session.beginTransaction();
			session.save(theUser);
			session.getTransaction().commit();

		} finally {
			System.out.println("The user has been added");
			sessionFactory.close();
		}

	}

}
