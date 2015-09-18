/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
 
public class HibernateUtil 
{
 
    private HibernateUtil()
      {
 
      }
 
    private static SessionFactory sess = null;
     
    public static synchronized final SessionFactory getSessionFactory()
    {
        if(sess==null)
            sess = new Configuration().configure().buildSessionFactory();
          
        return sess;
    }
     
 
}
