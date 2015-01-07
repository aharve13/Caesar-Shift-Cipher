
/**               	        Program: CAESAR SHIFT CIPHER
 *----------------------------------------------------------------------------------------
 *   @author Alex Harvey                     Compiler Used:     Eclipse
 *   Project No: 1 - Caesar Shift Cipher     Date Completed: 08/04/2011 (Updated 9/11/2012)
 *---------------------------------------------------------------------------------------
 *                            Caesar Shift Cipher Program
 * Purpose: This class contains one method and does NOT contain main() method. 
 *          The method accepts two parameters and returns no values. 
 *          The description of the method is below: 
 *-----------------------------------------------------------------------------------------------
 *   Method Name                      Description
 *-----------------------------------------------------------------------------------------------
 *   topOfPageInfo()                  Prints info about the programmer and the project.  It also
 *                                    prints current date and time when program is executed.
 *-----------------------------------------------------------------------------------------------
 */

import java.util.*;

public class MyInfo {
	
	     final static String DASHES = "-----------------------------------------------------------------"; 
	     final static String DASHES_2 = "----------";

	     /**
	      *  The method writes programmer and lab info. Programmer name is declares as a constant,
	      *  so is a string of dashes in class. It also prints due completed, and current date on which
	      *  the program was executed.  
	 	  *
	 	  *  @param    ProjectNumber      project number
	      *  @param    DateCreated        date the project was completed
	      *  @return   none
	      */
	     
	      public static void topOfPageInfo(String ProjectNumber, String DateCreated)
	  
          {
	  
               final String MY_NAME = "Alex A. Harvey"; //local variable for my name
		 
               System.out.println ("\n\t" + DASHES);
		       System.out.println ("\t\t\tProgrammer:      " + MY_NAME);
		       System.out.println ("\n\t\t\tProject No:      " + ProjectNumber);
		       System.out.println ("\t\t\tDate Created:    " + DateCreated);
		  
         
		       Date todaysDate = new Date( );
		       System.out.println ("\n\t\t\tToday's Date and time are:\n\t\t\t"
		                            + todaysDate); 
               System.out.println ("\t" + DASHES);
     
	      }   //end of topOfPageInfo()
	
}     //end of MyInfo

