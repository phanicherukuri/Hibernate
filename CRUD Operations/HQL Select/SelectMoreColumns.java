package beans;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectMoreColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "select name,hq from Select";
		Query q = s.createQuery(hql);
		List<Object> l = q.list();
		for(Object o:l)
		{
			Object arr[] = (Object[])o;
			System.out.print(arr[0] + " ");
			System.out.println(arr[1]);
		}
		
	}

}
