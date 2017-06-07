package com.pagination.CachingLevel2;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class QueryLevelCache {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptop = null;
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Laptop.class);
    	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cfg.buildSessionFactory(reg);
    	Session s = sf.openSession();
    	s.beginTransaction();
    	Query q1 = s.createQuery("from Laptop where laptopid=1");
    	q1.setCacheable(true);
    	laptop = (Laptop)q1.uniqueResult();
    	System.out.println("ID: "+laptop.getLaptopid()+"\nNAME: "+laptop.getName()+"\nSeriesNo: "+laptop.getSeriesno()+"\nPrice: "+laptop.getPrice()+" USD\nSpecifications: "+laptop.getSpecs());
    	s.getTransaction().commit();
    	s.close();
    	
    	System.out.println("__________________________________________");
    	
    	Session s1 = sf.openSession();
    	s1.beginTransaction();
    	Query q2 = s1.createQuery("from Laptop where laptopid=1");
    	q2.setCacheable(true);
    	laptop = (Laptop)q2.uniqueResult();
    	System.out.println("ID: "+laptop.getLaptopid()+"\nNAME: "+laptop.getName()+"\nSeriesNo: "+laptop.getSeriesno()+"\nPrice: "+laptop.getPrice()+" USD\nSpecifications: "+laptop.getSpecs());
    	s1.getTransaction().commit();
    	s1.close();
    	
    	
	}

}
