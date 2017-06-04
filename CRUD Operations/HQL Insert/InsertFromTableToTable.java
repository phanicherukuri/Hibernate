package beans;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertFromTableToTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "insert into NewStudent(id,name,email,address) select s.id,s.name,s.email,s.address from OldStudent s";
		Query q = s.createQuery(hql);
		int i = q.executeUpdate();
		t.commit();
		System.out.println("Updated rows into new table " +i);
		s.close();
		sf.close();
		
	}
}
