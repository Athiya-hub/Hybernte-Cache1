package com.athiya.hybernatecachelevel1.HybernateCacheLevel1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	
    	Model md=new Model();
    	Model md1=new Model();
    	md1.setId(2);
    	md1.setName("rimsha");
    	md1.setFavcolor("white");
    	md.setFavcolor("black");
    	md.setId(1);
    	md.setName("athiya");
    	Configuration con=new Configuration().configure("hybernate.cfg.xml").addAnnotatedClass(Model.class);
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session1=sf.openSession();
    	
    	
    	Transaction tx=session1.beginTransaction();
    	session1.save(md);
    	session1.save(md1);
    	
    	md=session1.get(Model.class, 1);
    	System.out.println(md);
    	tx.commit();
    session1.close();
    	
    	Session session2=sf.openSession();
    	Transaction tx2=session2.beginTransaction();
    	md=session2.get(Model.class, 1);
    	System.out.println(md);
    	tx2.commit();
    	session2.close();
    }
}
