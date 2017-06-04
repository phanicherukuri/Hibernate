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
		
		SoftwareEmployee se = new SoftwareEmployee(1, "Phani", "Phani@gmail.com", 10000000, "Bigdata");
		HardwareEmployee he = new HardwareEmployee(2, "Bhupesh", "B@gmail.com", 100000, 40);
		Manager m = new Manager(3, "K", "k@gmail.com", 1000001, 3);
		
		s.save(se);
		s.save(he);
		s.save(m);
		
		t.commit();
		s.close();
		sf.close();

	}

}
