package com.bridgeit.Dao;
import org.hibernate.Session;
import com.bridgeit.HibernateUtility.HibernateUtil;
import com.bridgeit.pojo.User;
public class DaoImpl implements IDao
{
	public String userRegister(User user) 
	{
		Session session =HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tran=(org.hibernate.Transaction) session.beginTransaction();
		String username=(String)session.save(user);
		try 
		{
			tran.commit();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return username;
	}
	public static DaoImpl getInstanc()
	{
		DaoImpl daoImpl = new DaoImpl();
		return daoImpl;
	}
	public boolean loginUser(String username, String password) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		if(session!=null)
		{
			User user=(User) session.get(User.class, username);
			user.toString();
			
			try 
			{
				if(password.equals(user.getPassword()))
				{
					System.out.println("user :"+user.toString());
					return true;
				}
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
			
		}
		else
		{
			System.out.println("server down");
		}
		return false;
	}
	public void changepassword(String username, String newpassword) 
	{
		Session session=HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tran=(org.hibernate.Transaction) session.beginTransaction();
		User user= (User) session.get(User.class, username);
		user.setPassword(newpassword);
		System.out.println(user.toString());
		session.save(user);
		tran.commit();
	}
}
