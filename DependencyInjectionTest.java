package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;



public class DependencyInjectionTest 
{

	public static void main(String[] args) 
	{
		      //create IOC Container
				try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");)
				{
					
				
				//get Target beans class obj ref
				SeasonFinder finder= ctx.getBean("sf",SeasonFinder.class);
			
				//invoke business method
				
				String result = finder.findSesson();
				System.out.println("Season Name: "+ result);
				}//try
				catch (Exception e) {
					e.printStackTrace();
				}
	}

}
