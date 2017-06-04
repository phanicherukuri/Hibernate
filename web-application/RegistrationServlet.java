package controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.RegistrationDetails;


@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

		SessionFactory sf;
		
	@Override
	public void init(ServletConfig config) throws ServletException {
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		System.out.println("Session Factory init");
		
		
		//super.init(config);
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String rname = req.getParameter("rname");
		String remail = req.getParameter("remail");
		int rmarks = Integer.parseInt(req.getParameter("rmarks"));
		Session s = sf.openSession();
		
		RegistrationDetails rd = new RegistrationDetails(0,rname,remail,rmarks);
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(rd);
		t.commit();
		s.close();
		resp.getWriter().println("Registrtaion Success id = ");
		
	}
	
	@Override
	public void destroy() {
		sf.close();
	}


}
