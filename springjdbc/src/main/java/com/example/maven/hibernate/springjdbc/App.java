package com.example.maven.hibernate.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context =
    		new ClassPathXmlApplicationContext("Spring-Conf.xml");

        /*Emp customerDAO = (Emp) context.getBean("emp1");
        customerDAO.show();*/

        Dept customerDAO = (Dept) context.getBean("dept1");
        customerDAO.showDep();
        customerDAO.getEmp().show();
        

    }
}

