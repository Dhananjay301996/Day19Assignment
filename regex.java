package day19Assignment;
import java.util.Scanner;
import java.util.regex.*;

public class regex {	
/*
 * Enter valid First and Last name from user
 */
		    Scanner userInput = new Scanner(System.in);
		    
	public void firstAndLastname() {
		  Pattern pattern = Pattern.compile("^[A-Z]{1}[A-Za-z]{2,}$");
	        
	        System.out.println("Enter First Name");
	       
	        String firstName = userInput.nextLine();
	        
	        Matcher matcher = pattern.matcher(firstName);
	        
	        if (matcher.matches() == false) {
	            System.out.println("Entered First Name does not Valid");	                	
	        }
	        System.out.println("Enter Last Name");
	        String lastName = userInput.nextLine();

	        matcher = pattern.matcher(lastName);

	        if (matcher.matches() == false) {
	            System.out.println("Entered Last Name does not Valid");
	        }		
	}
		
		  
	     
/*
 * enter valid mail id from user
 * 
 */
	   public void mail() {
		   
		   Pattern mail = Pattern.compile("[a-zA-Z0-9]+[@]+[a-z]{2,5}[.][a-z]{2,4}");
			 System.out.println("Enter Mail ID");
			 String mail1 = userInput.nextLine();
			 
			 Matcher matcher = mail.matcher(mail1);
			 if (matcher.matches() == false) {
		            System.out.println("Entered mail ID does not Valid");
		        }
		   	       
	}
/*
 * Enter valid Mobile number with country code
 */
	   public void mobileNumber() {
		   Pattern mobileNumber = Pattern.compile("[91]+[0-9]{10}");
		   System.out.println("Enter mobile number");
			 String mobile = userInput.nextLine();
			 
			 Matcher matcher = mobileNumber.matcher(mobile);
			 if (matcher.matches() == false) {
		            System.out.println("Entered mobile no. does not Valid");
		        }

	   }
/*
 * enter password minimum 8 character
 */
	   public void pass1() {
		   Pattern pass = Pattern.compile("[a-z]{8,12}");
		   System.out.println("Enter your password1");
			 String pass1 = userInput.nextLine();
			 
			 Matcher matcher = pass.matcher(pass1);
			 if (matcher.matches() == false) {
		            System.out.println("Entered pass1 does not Valid");
		        }
		   
	   }
/*
 * enter password at least one capital latter	   
 */
	   public void pass2() {
		   Pattern pass = Pattern.compile("[a-z]{8,12}[A-Z]{1,}");
		   System.out.println("Enter your password2");
			 String pass1 = userInput.nextLine();
			 
			 Matcher matcher = pass.matcher(pass1);
			 if (matcher.matches() == false) {
		            System.out.println("Entered pass2 does not Valid");
		        }
		   
	   }
/*
 * enter password at least one numeric number   
 */
	   public void pass3() {
		   Pattern pass = Pattern.compile("[a-z]{8,12}[A-Z]{1,}[0-9]{1,}");
		   System.out.println("Enter your password3");
			 String pass1 = userInput.nextLine();
			 
			 Matcher matcher = pass.matcher(pass1);
			 if (matcher.matches() == false) {
		            System.out.println("Entered pass3 does not Valid");
		        }
		   
	   }
/*
 *enter password at least one numeric number 
 */
	   public void pass4() {
		   Pattern pass = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,24}$");
		   System.out.println("Enter your password3");
			 String pass1 = userInput.nextLine();
			 
			 Matcher matcher = pass.matcher(pass1);
			 if (matcher.matches() == false) {
		            System.out.println("Entered pass4 does not Valid");
		        }
		   
	   }
		
			   
	   	public static void main(String[] args) {
		   regex a = new regex();
		   a.firstAndLastname();
		   a.mail();
		   a.mobileNumber();
		   a.pass1();
		   a.pass2();
		   a.pass3();
	   }

}
