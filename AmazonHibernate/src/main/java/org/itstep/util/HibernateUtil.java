package org.itstep.util;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private final SessionFactory sessionFactory; //= configureSessionFactory();

	public HibernateUtil() throws HibernateException {
		sessionFactory = configureSessionFactory();
	}

	/**
	 * Create SessionFactory
	 * 
	 * @return {@link SessionFactory}
	 * @throws HibernateException
	 */
	private SessionFactory configureSessionFactory() throws HibernateException {

//		String userDir = System.getProperty("user.dir");

//		Configuration configuration = new Configuration().configure(new File(userDir + "/src/main/resources/hibernate.cfg.xml"));
		
		Configuration configuration = new Configuration().configure();
		
		return configuration.buildSessionFactory();

	}

	/**
	 * Get SessionFactory
	 * 
	 * @return {@link SessionFactory}
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
