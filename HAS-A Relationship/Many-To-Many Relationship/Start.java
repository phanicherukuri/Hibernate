package beans;

import java.util.HashSet;
import java.util.Set;

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
		
		Course c1 = new Course();
		c1.setCourseid(1);
		c1.setCoursename("Hibernate");
		c1.setFee(400);
		
		Course c2 = new Course();
		c2.setCourseid(2);
		c2.setCoursename("Java");
		c2.setFee(400);
		
		Course c3 = new Course();
		c3.setCourseid(3);
		c3.setCoursename("SQL");
		c3.setFee(400);
		
		Course c4 = new Course();
		c4.setCourseid(4);
		c4.setCoursename("spring");
		c4.setFee(400);
		
		Set<Course> set1 = new HashSet<Course>();
		set1.add(c1);
		set1.add(c2);
		
		Set<Course> set2 = new HashSet<Course>();
		set2.add(c3);
		set2.add(c4);
		set2.add(c2);
		
		Faculty f1 = new Faculty();
		f1.setFacultyid(1);
		f1.setFacultyname("Phani");
		f1.setYrsexp(1);
		f1.setCourses(set1);
		
		Faculty f2 = new Faculty();
		f2.setFacultyid(2);
		f2.setFacultyname("Durga");
		f2.setYrsexp(10);
		f2.setCourses(set2);
		
		Faculty f3 = new Faculty();
		f3.setFacultyid(3);
		f3.setFacultyname("Naveen");
		f3.setYrsexp(10);
		f3.setCourses(set1);
		
		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);
		s.save(f1);
		s.save(f2);
		s.save(f3);
		
		t.commit();
		s.close();
		sf.close();
		
	}

}
