

/**               	        Program: CAESAR SHIFT CIPHER
 *----------------------------------------------------------------------------------------
 *   @author Alex Harvey                     Compiler Used:     Eclipse
 *   Project No: 1 - Caesar Shift Cipher     Date Completed: 08/04/2011 (Updated 9/11/2012)
 *---------------------------------------------------------------------------------------
 *                            Caesar Shift Cipher Program
 * Purpose: This class is the client class of the CaesarShiftCipherService() class and
 *          does contain the main() method. It calls various methods of the 
 *          CaesarShiftCipherService() class to encode and decode messages based on 
 *          user input. The description of the called methods are in the service class.
 *          The description of the main() method is below: 
 *-----------------------------------------------------------------------------------------------
 *   Method Name                  Description
 *-----------------------------------------------------------------------------------------------
 *   main()                Calls various methods of the CaesarShiftCipherService() class 
 *                         to encode and decode messages based on user input.
 *-----------------------------------------------------------------------------------------------
 */

public class CaesarShiftCipherClient {
	
    final static String DASHES = "-----------------------------------------------------------------"; 
    final static String DASHES_2 = "----------";
	
	public static void main (String[] args)
	{
        MyInfo.topOfPageInfo ("#01", "08/04/2011");  //call to topOfPageInfo method from MyInfo class
        CaesarShiftCipherService methodsObject = new CaesarShiftCipherService ();
        methodsObject.pageHeader();
		char ch = methodsObject.presentMenu();
		methodsObject.produceCipher (ch);     //pass character read from keyboard
	}   //end main() method

}   //end CaesarShiftCipherClient class
