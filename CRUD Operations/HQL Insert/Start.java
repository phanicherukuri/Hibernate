package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Start {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		NewStudent os4 = new NewStudent(5,"e","e@g.c","e-5");
//		OldStudent os2 = new OldStudent(2,"b","b@g.c","b-2");
//		OldStudent os3 = new OldStudent(3,"c","c@g.c","c-3");
		
		s.save(os4);
//		s.save(os2);
//		s.save(os3);
		
		t.commit();
		s.close();
		sf.close();
		
	}

}
