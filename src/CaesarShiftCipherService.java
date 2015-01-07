
/**               	        Program: CAESAR SHIFT CIPHER
 *----------------------------------------------------------------------------------------
 *   @author Alex Harvey                     Compiler Used:     Eclipse
 *   Project No: 1 - Caesar Shift Cipher     Date Completed: 08/04/2011 (Updated 9/11/2012)
 *---------------------------------------------------------------------------------------
 *                            Caesar Shift Cipher Program
 * Purpose: This class contains seven methods and does NOT contain main() method. 
 *          The methods encode and decode messages based on user input by shifting each 
 *          letter of the alphabet to the consecutive position. 
 *          The description of each method is below: 
 *-----------------------------------------------------------------------------------------------
 *   Method Name                      Description
 *-----------------------------------------------------------------------------------------------
 *   pageHeader()                  Prints the page header for the caesar shift cipher.
 *   presentMenu()                 Presents the menu for the caesar shift cipher.
 *   produceCipher()               Presents the menu for the caesar shift cipher encoder and 
 *                                 decoder, and then encodes or decodes the message based on 
 *                                 the user's choice.
 *   encoderSpecific ()            Encodes the user input message based on a specified shift in 
 *                                 the letters of the alphabet.
 *   encoderFull ()                Encodes the user input message and displays all of the encoded 
 *                                 messages by shifting the alphabet to each consecutive letter 
 *                                 of the alphabet.
 *   decoderSpecific()             Decodes the user input message based on a specified shift in 
 *                                 the letters of the alphabet.
 *   decoderFull()                 Decodes the user input message and displays all of the decoded 
 *                                 messages by shifting the alphabet to each consecutive letter 
 *                                 of the alphabet.
 *-----------------------------------------------------------------------------------------------
 */

import java.util.Scanner;

public class CaesarShiftCipherService {
	
    final static String DASHES = "-----------------------------------------------------------------"; 
    final static String DASHES_2 = "-----------------------------";
    
    /**
     *  This method prints the page header for the caesar shift cipher.  
	 *
	 *  @param    none
     *  @return   none
     */
	
	public void pageHeader ()
	{
        System.out.println("\n\t\t\t     CAESAR SHIFT CIPHER");
        System.out.println("\t\t\t" + DASHES_2);
	}   //end pageHeader() method
	
    /**
     *  This method presents the menu for the caesar shift cipher.  
	 *
	 *  @param    none
     *  @return   ch     user input choice
     */
	
    public char presentMenu ()
	{
	    Scanner scan = new Scanner (System.in);
	    	 
	    System.out.println("\n\t\t\tWhat Would You Like To Do?:");
	    System.out.println("\n\t\t\t   A. Encode A Message");
	    System.out.println("\n\t\t\t   B. Decode A Message");
	    System.out.println("\n\t\t\t   Q. Quit");
	    System.out.print ("\n\t\t\tEnter Your Selection --> ");
	    String str = scan.nextLine();
		char ch = str.toUpperCase().charAt(0);    //turn first char to upper case
		     
		while (ch != 'A' && ch!= 'B' && ch != 'Q')
		{
		    System.out.println("\n\t * * * * * Wrong Character Entered. * * * * *");
			System.out.println("\n\t\t\tWhat Would You Like To Do?:");
			System.out.println("\n\t\t\t   A. Encode A Message");
			System.out.println("\n\t\t\t   B. Decode A Message");
			System.out.println("\n\t\t\t   Q. Quit");
			System.out.print ("\n\t\t\tEnter Your Selection --> ");
			str = scan.nextLine();
			ch = str.toUpperCase().charAt(0);    //turn first char to upper case
		}  //end while
		     
        System.out.println ("\n\t" + DASHES);
		return ch;
		     
	}   //end of presentMenu ()
    
    /**
     *  This method presents the menu for the caesar shift cipher encoder and 
     *  decoder, and then encodes or decodes the message based on the user's
     *  choice.  
	 *
	 *  @param    ch     user input choice
     *  @return   none
     */
	     	     
	public void produceCipher (char ch)
	{
	 	   Scanner scan = new Scanner (System.in);
	 	   String str;
	 	   char selection;
		   while (ch != 'Q')
		   {   
		        switch (ch)
		        {      case 'A':    System.out.println("\n\t\t\t CAESAR SHIFT CIPHER ENCODER");
		                            System.out.println ("\t\t\t" + DASHES_2);
		                      	    System.out.println("\n\t\tHow Would You Like To Encode The Message?:");
		                    	    System.out.println("\n\t\t   A. Shift The Alphabet A Specific Number Of Times");
		                    	    System.out.println("\n\t\t   B. See All Options Available For Each Shift");
		                    	    System.out.print ("\n\t\tEnter Your Selection --> ");
		                    	    str = scan.nextLine();
		                    		selection = str.toUpperCase().charAt(0);    //turn first char to upper case
		                    		
		                    		switch (selection)
		                    		{   case 'A':   encoderSpecific ();
		                    		                break;
		                    		    case 'B':   encoderFull ();
		                    		                break;
		                    		    default:    ;  //do nothing
		                    		}  //end switch
		                    		
		                    		while (selection != 'A' && selection != 'B')
		                    		{
		                    		    System.out.println("\n\t  * * * * * Wrong Character Entered. * * * * *");
		                    			System.out.println("\n\t\tHow Would You Like To Encode The Message?:");
		                    			System.out.println("\n\t\t   A. Shift The Alphabet A Specific Number Of Times");
		                    			System.out.println("\n\t\t   B. See All Options Available For Each Shift");
		                    			System.out.print ("\n\t\tEnter Your Selection --> ");
		                    			str = scan.nextLine();
		                    			selection = str.toUpperCase().charAt(0);    //turn first char to upper case
		                    			
		                    			switch (selection)
			                    		{   case 'A':   encoderSpecific ();
			                    		                break;
			                    		    case 'B':   encoderFull ();
			                    		                break;
			                    		    default:    ;  //do nothing
			                    		}  //end switch
		                    		}  //end while
		    	     		        System.out.println ("\n\t" + DASHES);
		    	                    ch = presentMenu ();
		                            break;
		                        
		               case 'B':    System.out.println("\n\t\t\t CAESAR SHIFT CIPHER DECODER");
                                    System.out.println ("\t\t\t" + DASHES_2);
            	                    System.out.println("\n\t\tHow Would You Like To Decode The Message?:");
          	                        System.out.println("\n\t\t   A. Shift The Alphabet A Specific Number Of Times");
          	                        System.out.println("\n\t\t   B. See All Options Available For Each Shift");
          	                        System.out.print ("\n\t\tEnter Your Selection --> ");
          	                        str = scan.nextLine();
          		                    selection = str.toUpperCase().charAt(0);    //turn first char to upper case
          		
          		                    switch (selection)
          		                    {   case 'A':   decoderSpecific ();
          		                                    break;
          		                        case 'B':   decoderFull ();
          		                                    break;
          		                        default:    ;  //do nothing
          		                    }  //end switch
          		
          		                    while (selection != 'A' && selection != 'B')
          		                    {
          		                        System.out.println("\n\t  * * * * * Wrong Character Entered. * * * * *");
          			                    System.out.println("\n\t\tHow Would You Like To Encode The Message?:");
          			                    System.out.println("\n\t\t   A. Shift The Alphabet A Specific Number Of Times");
          			                    System.out.println("\n\t\t   B. See All Options Available For Each Shift");
          			                    System.out.print ("\n\t\tEnter Your Selection --> ");
          			                    str = scan.nextLine();
          			                    selection = str.toUpperCase().charAt(0);    //turn first char to upper case
          			
          			                    switch (selection)
              		                    {   case 'A':   decoderSpecific ();
              		                                    break;
              		                        case 'B':   decoderFull ();
              		                                    break;
              		                        default:    ;  //do nothing
              		                    }  //end switch
          		                    }  //end while
   		                            System.out.println ("\n\t" + DASHES);
                                    ch = presentMenu ();
                                    break;
                            		                        
		               default:     ;  //do nothing
		        }  //end switch
		   } //end while
  
	}   //end of produceCipher ()
	
    /**
     *  This method encodes the user input message based on a specified shift in 
     *  the letters of the alphabet.
	 *
	 *  @param    none
     *  @return   none
     */
	
	public void encoderSpecific ()
	{
 	    Scanner scan = new Scanner (System.in);
 	    int count = 0;   //number of characters in message
 	    int repetitionNumber = 1;  //number of repetitions needed to shift the plaintext to all letters of the alphabet
 	    int alphabetNumber;   //number of letters in the alphabet
 	    String plaintext;   //message to be encoded
 	    int shiftNumber = 0;  //number to shift the letters by
		int index5 = 0;
		int index6 = 0;
 	    char [] ciphertext;    //encoded message
 	    char [] shiftedCipherAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
 	    		                         'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};   //the shifted alphabet of the cipher
 	    char [] shiftedCipherAlphabetLowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                                  'n','o','p','q','r','s','t','u','v','w','x','y','z'};   //the shifted alphabet of the cipher
		
		System.out.print("\n\t\tPlease Enter Plaintext To Be Encoded: ");
		plaintext = scan.nextLine().toUpperCase();
		count = plaintext.length();
    	ciphertext = new char [count];
    	System.out.print("\n\t\tPlease Enter Number To Be Shifted By: ");
    	shiftNumber = scan.nextInt();
    	System.out.println("\n\n\tLetters");
    	System.out.println("\tShifted" + "\t     Encoded Message" + "\t      Shifted Alphabet Used");
    	System.out.println("\t" + DASHES);
    	
    	while (repetitionNumber <= shiftNumber)
    	{
			int index1 = 25;
			int index2 = 0;
			int index3;
			int index4 = 0;
	    	alphabetNumber = 1;
			char tempLetter = shiftedCipherAlphabet [index1];
			char tempLetter2 = shiftedCipherAlphabetLowerCase [index1];
    		while (alphabetNumber <= 25)   //manipulates the ciphered alphabet to shift the letters around
    		{
    			shiftedCipherAlphabet [index1] = shiftedCipherAlphabet [index1 - 1];
    			shiftedCipherAlphabetLowerCase [index1] = shiftedCipherAlphabetLowerCase [index1 - 1];
    			index1--;
    			alphabetNumber++;
    		}  //end of while
    		shiftedCipherAlphabet [0] = tempLetter;
    		shiftedCipherAlphabetLowerCase [0] = tempLetter2;
    		
    		while (index2 < count)  //stores the characters from the plaintext into the ciphertext array
    		{
    			ciphertext [index2] = plaintext.charAt(index2);
    			index2++;
    		}   //end of while
    		
    		for (index3 = 0; index3 < count; index3++) //finds the occurrence of each letter of the message and encodes it to ciphertext
    		{
    			 boolean found = false;
    			 index4 = 0;
    		     while (!found && index4 < 26)
    		     {   
    		          if (ciphertext [index3] == shiftedCipherAlphabet [index4])   //character found in array
    		          {   
    		              switch (index4)
    		              {
    		                  case 0:     ciphertext [index3] = 'A';
    		                              break;
    		                  case 1:     ciphertext [index3] = 'B';
                                          break;
    		                  case 2:     ciphertext [index3] = 'C';
    		                              break;
    		                  case 3:     ciphertext [index3] = 'D';
                                          break;
    		                  case 4:     ciphertext [index3] = 'E';
                                          break;
    		                  case 5:     ciphertext [index3] = 'F';
                                          break;
    		                  case 6:     ciphertext [index3] = 'G';
                                          break;
    		                  case 7:     ciphertext [index3] = 'H';
                                          break;
    		                  case 8:     ciphertext [index3] = 'I';
                                          break;
    		                  case 9:     ciphertext [index3] = 'J';
                                          break;
    		                  case 10:    ciphertext [index3] = 'K';
                                          break;
    		                  case 11:    ciphertext [index3] = 'L';
                                          break;
    		                  case 12:    ciphertext [index3] = 'M';
                                          break;
    		                  case 13:    ciphertext [index3] = 'N';
                                          break;
    		                  case 14:    ciphertext [index3] = 'O';
                                          break;
    		                  case 15:    ciphertext [index3] = 'P';
                                          break;
    		                  case 16:    ciphertext [index3] = 'Q';
                                          break;
    		                  case 17:    ciphertext [index3] = 'R';
                                          break;
    		                  case 18:    ciphertext [index3] = 'S';
                                          break;
    		                  case 19:    ciphertext [index3] = 'T';
                                          break;
    		                  case 20:    ciphertext [index3] = 'U';
                                          break;
    		                  case 21:    ciphertext [index3] = 'V';
                                          break;
    		                  case 22:    ciphertext [index3] = 'W';
                                          break;
    		                  case 23:    ciphertext [index3] = 'X';
                                          break;
    		                  case 24:    ciphertext [index3] = 'Y';
                                          break;
    		                  case 25:    ciphertext [index3] = 'Z';
                                          break;
                              default:    ;   //do nothing
    		              }   //end switch
    		              found = true; 
    		              
    		          }  // end if
    		          
    		          index4++;       // move to next subscript
    		     }  // end of while
    			

    		}   //end of for
    		
    		repetitionNumber++;
    	}  //end of while
    	
		System.out.print("\n\t  " + (repetitionNumber - 1) + ".\t       ");
		
		while (index5 < count)
		{
    		System.out.print(ciphertext [index5]);
    		index5++;
		}
		System.out.print("\t    ");
		while (index6 < 26)
		{
			System.out.print(shiftedCipherAlphabetLowerCase [index6]);
    		index6++;
		}
		System.out.println("");
    	
	}   //end encoderSpecific() method 
	
    /**
     *  This method encodes the user input message and displays all of the encoded messages 
     *  by shifting the alphabet to each consecutive letter of the alphabet.  
	 *
	 *  @param    none
     *  @return   none
     */
	
	public void encoderFull ()
	{
 	    Scanner scan = new Scanner (System.in);
 	    int count = 0;   //number of characters in message
 	    int repetitionNumber = 1;  //number of repetitions needed to shift the plaintext to all letters of the alphabet
 	    int alphabetNumber;   //number of letters in the alphabet
 	    String plaintext;   //message to be encoded
 	    char [] ciphertext;    //encoded message
 	    char [] shiftedCipherAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                                         'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};   //the shifted alphabet of the cipher
 	    char [] shiftedCipherAlphabetLowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                                                  'n','o','p','q','r','s','t','u','v','w','x','y','z'};   //the shifted alphabet of the cipher
		
		System.out.print("\n\t\tPlease Enter Plaintext To Be Encoded: ");
		plaintext = scan.nextLine().toUpperCase();
		count = plaintext.length();
    	ciphertext = new char [count];
    	System.out.println("\n\n\tLetters");
    	System.out.println("\tShifted" + "\t     Encoded Message" + "\t      Shifted Alphabet Used");
    	System.out.println("\t" + DASHES);
    	
    	while (repetitionNumber <= 26)
    	{
			int index1 = 25;
			int index2 = 0;
			int index3;
			int index4 = 0;
			int index5 = 0;
			int index6 = 0;
	    	alphabetNumber = 1;
			char tempLetter = shiftedCipherAlphabet [index1];
			char tempLetter2 = shiftedCipherAlphabetLowerCase [index1];
    		while (alphabetNumber <= 25)   //manipulates the ciphered alphabet to shift the letters around
    		{
    			shiftedCipherAlphabet [index1] = shiftedCipherAlphabet [index1 - 1];
    			shiftedCipherAlphabetLowerCase [index1] = shiftedCipherAlphabetLowerCase [index1 - 1];
    			index1--;
    			alphabetNumber++;
    		}  //end of while
    		shiftedCipherAlphabet [0] = tempLetter;
    		shiftedCipherAlphabetLowerCase [0] = tempLetter2;
    		
    		while (index2 < count)  //stores the characters from the plaintext into the ciphertext array
    		{
    			ciphertext [index2] = plaintext.charAt(index2);
    			index2++;
    		}   //end of while
    		
    		for (index3 = 0; index3 < count; index3++) //finds the occurrence of each letter of the message and encodes it to ciphertext
    		{
    			 boolean found = false;
    			 index4 = 0;
    		     while (!found && index4 < 26)
    		     {   
    		          if (ciphertext [index3] == shiftedCipherAlphabet [index4])   //character found in array
    		          {   
    		              switch (index4)
    		              {
		                  		case 0:     ciphertext [index3] = 'A';
                          			  		break;
		                  		case 1:     ciphertext [index3] = 'B';
                        			  		break;
		                  		case 2:     ciphertext [index3] = 'C';
		                  					break;
		                  		case 3:     ciphertext [index3] = 'D';
                        			  		break;
		                  		case 4:     ciphertext [index3] = 'E';
                        			  		break;
		                  		case 5:     ciphertext [index3] = 'F';
                        			  		break;
		                  		case 6:     ciphertext [index3] = 'G';
                        			  		break;
		                  		case 7:     ciphertext [index3] = 'H';
                        			  		break;
		                  		case 8:     ciphertext [index3] = 'I';
                        			  		break;
		                  		case 9:     ciphertext [index3] = 'J';
                          			  		break;
		                  		case 10:    ciphertext [index3] = 'K';
                          			  		break;
		                  		case 11:    ciphertext [index3] = 'L';
                          			  		break;
		                  		case 12:    ciphertext [index3] = 'M';
                          			  		break;
		                  		case 13:    ciphertext [index3] = 'N';
                          			  		break;
		                  		case 14:    ciphertext [index3] = 'O';
                          			  		break;
		                  		case 15:    ciphertext [index3] = 'P';
                          			  		break;
		                  		case 16:    ciphertext [index3] = 'Q';
                          			  		break;
		                  		case 17:    ciphertext [index3] = 'R';
                          			  		break;
		                  		case 18:    ciphertext [index3] = 'S';
                          			  		break;
		                  		case 19:    ciphertext [index3] = 'T';
                          			  		break;
		                  		case 20:    ciphertext [index3] = 'U';
                          			  		break;
		                  		case 21:    ciphertext [index3] = 'V';
                          			  		break;
		                  		case 22:    ciphertext [index3] = 'W';
                          			  		break;
		                  		case 23:    ciphertext [index3] = 'X';
                          			  		break;
		                  		case 24:    ciphertext [index3] = 'Y';
                          			  		break;
		                  		case 25:    ciphertext [index3] = 'Z';
                          			  		break;
		                  		default:    ;   //do nothing
    		              }   //end switch
    		              found = true; 
    		              
    		          }  // end if
    		          
    		          index4++;       // move to next subscript
    		     }  // end of while
    			

    		}   //end of for
    		
    		System.out.print("\n\t  " + (repetitionNumber) + ".\t       ");
    		
    		while (index5 < count)
    		{
        		System.out.print(ciphertext [index5]);
        		index5++;
    		}
    		System.out.print("\t    ");
    		while (index6 < 26)
    		{
    			System.out.print(shiftedCipherAlphabetLowerCase [index6]);
        		index6++;
    		}
    		System.out.println("");
    		repetitionNumber++;
    	}  //end of while
    	
	}   //end encoderFull() method
	
    /**
     *  This method decodes the user input message based on a specified shift in 
     *  the letters of the alphabet.
	 *
	 *  @param    none
     *  @return   none
     */
	
	public void decoderSpecific ()
	{
 	    Scanner scan = new Scanner (System.in);
 	    int count = 0;   //number of characters in message
 	    int repetitionNumber = 1;  //number of repetitions needed to shift the ciphertext to all letters of the alphabet
 	    int alphabetNumber;   //number of letters in the alphabet
 	    String ciphertext;   //encoded message
 	    int shiftNumber = 0;  //number to shift the letters by
		int index5 = 0;
		int index6 = 0;
 	    char [] plaintext;    //decoded message
 	    char [] shiftedCipherAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
 	    		                         'n','o','p','q','r','s','t','u','v','w','x','y','z'};   //the shifted alphabet of the cipher
		
		System.out.print("\n\t\tPlease Enter Ciphertext To Be Decoded: ");
		ciphertext = scan.nextLine().toLowerCase();
		count = ciphertext.length();
    	plaintext = new char [count];
    	System.out.print("\n\t\tPlease Enter Number To Be Shifted By: ");
    	shiftNumber = scan.nextInt();
    	System.out.println("\n\n\tLetters");
    	System.out.println("\tShifted" + "\t     Decoded Message" + "\t      Shifted Alphabet Used");
    	System.out.println("\t" + DASHES);
    	
    	while (repetitionNumber <= shiftNumber)
    	{
			int index1 = 0;
			int index2 = 0;
			int index3;
			int index4 = 0;
	    	alphabetNumber = 1;
			char tempLetter = shiftedCipherAlphabet [index1];
    		while (alphabetNumber <= 25)   //manipulates the ciphered alphabet to shift the letters around
    		{
    			shiftedCipherAlphabet [index1] = shiftedCipherAlphabet [index1 + 1];
    			index1++;
    			alphabetNumber++;
    		}  //end of while
    		shiftedCipherAlphabet [25] = tempLetter;
    		
    		while (index2 < count)  //stores the characters from the ciphertext into the plaintext array
    		{
    			plaintext [index2] = ciphertext.charAt(index2);
    			index2++;
    		}   //end of while
    		
    		for (index3 = 0; index3 < count; index3++) //finds the occurrence of each letter of the encoded message and decodes it to plaintext
    		{
    			 boolean found = false;
    			 index4 = 0;
    		     while (!found && index4 < 26)
    		     {   
    		          if (plaintext [index3] == shiftedCipherAlphabet [index4])   //character found in array
    		          {   
    		              switch (index4)
    		              {
    		                  case 0:     plaintext [index3] = 'a';
    		                              break;
    		                  case 1:     plaintext [index3] = 'b';
                                          break;
    		                  case 2:     plaintext [index3] = 'c';
    		                              break;
    		                  case 3:     plaintext [index3] = 'd';
                                          break;
    		                  case 4:     plaintext [index3] = 'e';
                                          break;
    		                  case 5:     plaintext [index3] = 'f';
                                          break;
    		                  case 6:     plaintext [index3] = 'g';
                                          break;
    		                  case 7:     plaintext [index3] = 'h';
                                          break;
    		                  case 8:     plaintext [index3] = 'i';
                                          break;
    		                  case 9:     plaintext [index3] = 'j';
                                          break;
    		                  case 10:    plaintext [index3] = 'k';
                                          break;
    		                  case 11:    plaintext [index3] = 'l';
                                          break;
    		                  case 12:    plaintext [index3] = 'm';
                                          break;
    		                  case 13:    plaintext [index3] = 'n';
                                          break;
    		                  case 14:    plaintext [index3] = 'o';
                                          break;
    		                  case 15:    plaintext [index3] = 'p';
                                          break;
    		                  case 16:    plaintext [index3] = 'q';
                                          break;
    		                  case 17:    plaintext [index3] = 'r';
                                          break;
    		                  case 18:    plaintext [index3] = 's';
                                          break;
    		                  case 19:    plaintext [index3] = 't';
                                          break;
    		                  case 20:    plaintext [index3] = 'u';
                                          break;
    		                  case 21:    plaintext [index3] = 'v';
                                          break;
    		                  case 22:    plaintext [index3] = 'w';
                                          break;
    		                  case 23:    plaintext [index3] = 'x';
                                          break;
    		                  case 24:    plaintext [index3] = 'y';
                                          break;
    		                  case 25:    plaintext [index3] = 'z';
                                          break;
                              default:    ;   //do nothing
    		              }   //end switch
    		              found = true; 
    		              
    		          }  // end if
    		          
    		          index4++;       // move to next subscript
    		     }  // end of while
    			

    		}   //end of for
    		
    		repetitionNumber++;
    	}  //end of while
    	
		System.out.print("\n\t  " + (repetitionNumber - 1) + ".\t       ");
		
		while (index5 < count)
		{
    		System.out.print(plaintext [index5]);
    		index5++;
		}
		System.out.print("\t    ");
		while (index6 < 26)
		{
			System.out.print(shiftedCipherAlphabet [index6]);
    		index6++;
		}
		System.out.println("");
    	
	}   //end decoderSpecific() method 
	
    /**
     *  This method decodes the user input message and displays all of the decoded messages 
     *  by shifting the alphabet to each consecutive letter of the alphabet.  
	 *
	 *  @param    none
     *  @return   none
     */
	
	public void decoderFull ()
	{
 	    Scanner scan = new Scanner (System.in);
 	    int count = 0;   //number of characters in message
 	    int repetitionNumber = 1;  //number of repetitions needed to shift the ciphertext to all letters of the alphabet
 	    int alphabetNumber;   //number of letters in the alphabet
 	    String ciphertext;   //encoded message
 	    char [] plaintext;    //decoded message
 	    char [] shiftedCipherAlphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
 	    		                         'n','o','p','q','r','s','t','u','v','w','x','y','z'};   //the shifted alphabet of the cipher
		
		System.out.print("\n\t\tPlease Enter Ciphertext To Be Decoded: ");
		ciphertext = scan.nextLine().toLowerCase();
		count = ciphertext.length();
    	plaintext = new char [count];
    	System.out.println("\n\n\tLetters");
    	System.out.println("\tShifted" + "\t     Decoded Message" + "\t      Shifted Alphabet Used");
    	System.out.println("\t" + DASHES);
    	
    	while (repetitionNumber <= 26)
    	{
    		int index1 = 0;
			int index2 = 0;
			int index3;
			int index4 = 0;
			int index5 = 0;
			int index6 = 0;
	    	alphabetNumber = 1;
			char tempLetter = shiftedCipherAlphabet [index1];
    		while (alphabetNumber <= 25)   //manipulates the ciphered alphabet to shift the letters around
    		{
    			shiftedCipherAlphabet [index1] = shiftedCipherAlphabet [index1 + 1];
    			index1++;
    			alphabetNumber++;
    		}  //end of while
    		shiftedCipherAlphabet [25] = tempLetter;
	    	    		
    		while (index2 < count)  //stores the characters from the ciphertext into the plaintext array
    		{
    			plaintext [index2] = ciphertext.charAt(index2);
    			index2++;
    		}   //end of while
    		
    		for (index3 = 0; index3 < count; index3++) //finds the occurrence of each letter of the encoded message and decodes it to plaintext
    		{
    			 boolean found = false;
    			 index4 = 0;
    		     while (!found && index4 < 26)
    		     {   
    		          if (plaintext [index3] == shiftedCipherAlphabet [index4])   //character found in array
    		          {   
    		              switch (index4)
    		              {
    		                  case 0:     plaintext [index3] = 'a';
    		                              break;
    		                  case 1:     plaintext [index3] = 'b';
                                          break;
    		                  case 2:     plaintext [index3] = 'c';
    		                              break;
    		                  case 3:     plaintext [index3] = 'd';
                                          break;
    		                  case 4:     plaintext [index3] = 'e';
                                          break;
    		                  case 5:     plaintext [index3] = 'f';
                                          break;
    		                  case 6:     plaintext [index3] = 'g';
                                          break;
    		                  case 7:     plaintext [index3] = 'h';
                                          break;
    		                  case 8:     plaintext [index3] = 'i';
                                          break;
    		                  case 9:     plaintext [index3] = 'j';
                                          break;
    		                  case 10:    plaintext [index3] = 'k';
                                          break;
    		                  case 11:    plaintext [index3] = 'l';
                                          break;
    		                  case 12:    plaintext [index3] = 'm';
                                          break;
    		                  case 13:    plaintext [index3] = 'n';
                                          break;
    		                  case 14:    plaintext [index3] = 'o';
                                          break;
    		                  case 15:    plaintext [index3] = 'p';
                                          break;
    		                  case 16:    plaintext [index3] = 'q';
                                          break;
    		                  case 17:    plaintext [index3] = 'r';
                                          break;
    		                  case 18:    plaintext [index3] = 's';
                                          break;
    		                  case 19:    plaintext [index3] = 't';
                                          break;
    		                  case 20:    plaintext [index3] = 'u';
                                          break;
    		                  case 21:    plaintext [index3] = 'v';
                                          break;
    		                  case 22:    plaintext [index3] = 'w';
                                          break;
    		                  case 23:    plaintext [index3] = 'x';
                                          break;
    		                  case 24:    plaintext [index3] = 'y';
                                          break;
    		                  case 25:    plaintext [index3] = 'z';
                                          break;
                              default:    ;   //do nothing
    		              }   //end switch
    		              found = true; 
    		              
    		          }  // end if
    		          
    		          index4++;       // move to next subscript
    		     }  // end of while
    			

    		}   //end of for
    		
    		
    		System.out.print("\n\t  " + (repetitionNumber) + ".\t       ");
    		
    		while (index5 < count)
    		{
        		System.out.print(plaintext [index5]);
        		index5++;
    		}
    		System.out.print("\t    ");
    		while (index6 < 26)
    		{
    			System.out.print(shiftedCipherAlphabet [index6]);
        		index6++;
    		}
    		System.out.println("");
    		repetitionNumber++;
    	}  //end of while
    	
	}   //end decoderFull() method  

}   //end CaesarShiftCipherService class

