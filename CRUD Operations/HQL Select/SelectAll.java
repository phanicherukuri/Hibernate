package beans;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "from Select";
		Query q = s.createQuery(hql);
		List<Select> l = q.list();
		for(Select o:l)
		{
			System.out.println("_____________________");
			System.out.println("ID: "+o.getId());
			System.out.println("Name: "+ o.getName());
			System.out.println("HQ: "+o.getHq());
			System.out.println("Turn Over: "+o.getTurnover());
		}
	
	}

}
