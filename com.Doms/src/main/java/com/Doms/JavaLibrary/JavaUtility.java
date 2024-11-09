package com.Doms.JavaLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

 /**
 * This class provides the Reusable Methods to perform Java Related Actions
 * By Calling In-Built Methods
 *@author AJJU*/
public class JavaUtility {
              
	public static void pause(long time)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public int generateRandomNum(int limit)
	{
		Random random = new Random();
		return random.nextInt();
		
	}
	
	public String getCurrentTime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
		}
	
	
	
	
	
	
}
