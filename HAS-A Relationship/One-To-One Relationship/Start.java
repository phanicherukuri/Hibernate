package beans;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Voter v1 = new Voter();
		v1.setVid(1);
		v1.setVname("Phani");
		v1.setVage(23);
		
		Vote v2 = new Vote();
		v2.setPname("Republicans");
		v2.setCdate(new Date());
		v2.setVoter(v1);
		
		s.save(v1);
		s.save(v2);
		s.beginTransaction().commit();
		s.close();
		sf.close();
		
		
	}

}
