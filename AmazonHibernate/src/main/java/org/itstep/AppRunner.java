package org.itstep;

import java.sql.Date;

import org.hibernate.Session;
import org.itstep.model.Account;
import org.itstep.model.Action;
import org.itstep.model.Goods;
import org.itstep.util.HibernateUtil;

/**
 * @author Yaroslava
 */
public class AppRunner {
	public static void  main(String[] args) {
		Account acc = new Account("qqqq", "dddd", "llll", "gggg", new Date(14, 4,12).getTime());
		
		Goods good = new Goods("eeee", "ssss", 223, 300, "uuuuuuuu", "23eeeee");
		HibernateUtil  hU = new HibernateUtil();
		
		//SAVE
		Session session1 = hU.getSessionFactory().openSession();
		session1.getTransaction().begin();
		session1.save(acc);
		session1.save(good);
		session1.getTransaction().commit();
		session1.close();
		System.out.println("account saved!");
		
		//GET
		Session session2 = hU.getSessionFactory().openSession();
		session2.getTransaction().begin();
//		session2.get();
		//session2.get();
		session2.getTransaction().commit();
		session2.close();
		System.out.println("account ");
		
		//UPDATE
		Session session3 = hU.getSessionFactory().openSession();
		
		session3.getTransaction().begin();
		session3.update(acc);
		acc.setFirstName("nnnn");
		acc.setSecondName("oooo");
		acc.setLogin("kkk");
		acc.setPassword("vvv");
		
		good.setAsin("iii");
		good.setName("rrrr");
		good.setPrice(123);
		good.setInitial_price(234);
		good.setGood_url("oiuytr");
		good.setImg_url("zxcvb123");
		
		session3.getTransaction().commit();
		session3.close();
		System.out.println("account updeted!");
		
		//DELETE
		Session session4 = hU.getSessionFactory().openSession();
		session4.getTransaction().begin();
		session4.delete(acc);
		session4.delete(good);
		session4.getTransaction().commit();
		session4.close();
		System.out.println("account deleted!");
	}

}
