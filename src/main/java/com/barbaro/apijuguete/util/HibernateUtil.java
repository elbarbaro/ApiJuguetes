package com.barbaro.apijuguete.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	public static Session getSession() {
		
		Session session = null;
		
		StandardServiceRegistry registry
			= new StandardServiceRegistryBuilder()
			.configure() // leer hibernate.cfg.xml
			.build(); // construye el objeto 
		
		SessionFactory sessionF = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
		
		session = sessionF.openSession();
		
		System.out.println("Se abrio la conexión");
		return session;
	}
	
	public static void closeSession(Session session) {
		System.out.println("Se cerro la conexión");
		session.close();
	}
}








