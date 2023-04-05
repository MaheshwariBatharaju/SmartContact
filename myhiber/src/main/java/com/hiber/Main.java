package com.hiber;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hiber.cfg.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tr=s.beginTransaction();
	Emp e=new Emp();
	e.setEmpid(103);
	e.setEname("aaaaa");
	e.setCity("hyd");
	s.save(e);
	System.out.println("created");
	tr.commit();
	s.close();

	}

}
