package com.wipro;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class DataBaseController
{
	
	
	//Constructor to save default customer details
	public DataBaseController() 
	{
		super();
		// TODO Auto-generated constructor stub

		CreditCard CreditCard1 = new CreditCard("AXSSP1122H" ,3.10);
		CreditCard CreditCard2 = new CreditCard("APPSA3355P" ,8.50);
		CreditCard CreditCard3 = new CreditCard("APPXA2244X" ,9.50);
		CreditCard CreditCard4 = new CreditCard("AXVPS7766V" ,1.50);
		CreditCard CreditCard5 = new CreditCard("ASXPS2121S" ,5.10);
		
	        Transaction transaction = null;
	        try (Session session = HibernateUtil.getSessionFactory().openSession())
	        {
	            // start a transaction..
	            transaction = session.beginTransaction();
	            
	            // save the customer object..
	            session.save(CreditCard1);
	            session.save(CreditCard2);
	            session.save(CreditCard3);
	            session.save(CreditCard4);
	            session.save(CreditCard5);
	            
	            // commit transaction..
	            transaction.commit();
	            
	            System.out.println("Data saved successfully");
	           
	        } 
	        catch (Exception e)
	        {
	        	System.out.println("Error "+ e);
	            if (transaction != null)
	            {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	}
	
	
	
	//To get Customer details
	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public  List<CreditCard> getCreditCardDetails(String pan)
	{

        Transaction transaction = null;
        List<CreditCard> list = null;
      
		 try (Session session = HibernateUtil.getSessionFactory().openSession())
	        { 		
	        	String pan_num = pan.toUpperCase();
	        	Query q = session.createQuery("FROM CreditCard WHERE pan_num = '"+pan_num+"' ");
	        	q.list();
	        	list = q.getResultList();
	        	
	        	//System.out.println(list.size());
	        	//System.out.println(list.get(0).getId());
	        } 
	        catch (Exception e) 
	        {
	            if (transaction != null) 
	            {
	            	transaction.rollback();
	            }
	            e.printStackTrace();
	        }
		 
		return list;
		

	}
	
	
	
	
	

}
