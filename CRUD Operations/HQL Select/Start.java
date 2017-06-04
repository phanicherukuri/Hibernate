package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Select s1 = new Select(1,"ABC","Austin",1000000);
		Select s2 = new Select(2,"DEF","Austin",200);
		Select s3 = new Select(3,"GHI","Austin",336812137);
		Select s4 = new Select(4,"JKL","Austin",6482634);
		Select s5 = new Select(5,"MNO","Austin",6428361);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		
		t.commit();
		s.close();
		sf.close();
		 
	}

}
