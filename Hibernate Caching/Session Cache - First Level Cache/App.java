package com.pagination.SessionCahing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Movie m1 = null;
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Movie.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cfg.buildSessionFactory(reg);
    	
    	Session s = sf.openSession();
    	s.beginTransaction();
    	m1=(Movie)s.get(Movie.class, 1); //first time with session s
	    System.out.println("ID: "+m1.getMovieid()+"\nName: "+m1.getName()+"\nBudget: "+m1.getBudget()+"\nLanguage: "+m1.getLanguage());
	    
	    //second time with session s but query is not triggered again
	    m1=(Movie)s.get(Movie.class, 1); 
	    System.out.println("ID: "+m1.getMovieid()+"\nName: "+m1.getName()+"\nBudget: "+m1.getBudget()+"\nLanguage: "+m1.getLanguage());
	    
	    s.getTransaction().commit();
	    s.close();
	    
	    System.out.println("_____________________________________________");
	    
	    Session s1 = sf.openSession();
    	s1.beginTransaction();
    	m1=(Movie)s1.get(Movie.class, 1);
	    System.out.println("ID: "+m1.getMovieid()+"\nName: "+m1.getName()+"\nBudget: "+m1.getBudget()+"\nLanguage: "+m1.getLanguage());
    	s1.getTransaction().commit();
	    s1.close();
	      
    }
}
