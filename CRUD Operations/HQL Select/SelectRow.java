package beans;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		String hql = "from Select where id=5";
		Query q = s.createQuery(hql);
		Select select = (Select)q.uniqueResult();
		System.out.println(select.getId());
		System.out.println(select.getName());
		System.out.println(select.getHq());
		t.commit();
		s.close();
		sf.close();
		
	}

}
