package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.Set;
import java.util.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Authors a = new Authors();
		a.setAuthid(1);
		a.setName("J.K Rowling");
		
		Books b1 = new Books();
		b1.setBookid(10001);
		b1.setBookname("Harry Potter 1");
		
		Books b2 = new Books();
		b2.setBookid(10002);
		b2.setBookname("Harry Potter 2");
		
		Set set = new HashSet();
		set.add(b1);
		set.add(b2);
		
		a.setPublishedBooks(set);
		
		s.save(a);
		//s.save(b1);
		//s.save(b2);
	
		t.commit();
		s.close();
		sf.close();
		
	}

}
