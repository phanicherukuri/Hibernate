package beans;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "select avg(turnover) from Select";
		Query q = s.createQuery(hql);
		Double avg = (Double)q.uniqueResult();
		System.out.println(avg);
		s.close();
		sf.close();
		
	}

}
