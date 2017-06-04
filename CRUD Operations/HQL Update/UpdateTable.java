import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		//normal fields update hql
		//String hql = "update Update set name='l' where id=1 ";
		//primary key update
		//String hql = "update Update set id='2' where id=1 ";
		//updating more than one fields
		String hql = "update Update set name='a' , email='a@g.com' where id=2 ";
		
		Query q = s.createQuery(hql);
		int i = q.executeUpdate();
		
		t.commit();
		System.out.println(i);
		s.close();
		sf.close();
		
	}

}
