package Main;

import java.util.Date;
import java.util.Random;

public class autogenerateNumber
{
	/* public static void main(String[] args) {
    
        // Length of your password as I have choose
        // here to be 8
       int length = 5;
        System.out.println(newpassword(length));
    }
  
    // This our Password generating method
    // We have use static here, so that we not to
    // make any object for it
    static char[] newpassword(int len)
    {
        System.out.println("Generating password using random() : ");
        System.out.print("Your new password is : ");
  
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "123456789";
                
  
  
        String values = Capital_chars + Small_chars + numbers;
                        
  
        // Using random method
        Random rndm_method = new Random();
  
        char[] password = new char[len];
  
        for (int i = 0; i < len; i++)
        {
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
  
        }
        return password;
    } 
	
	

    	
    		   public static void main(String[] args) {

    		      System.out.println(generateOTP(8));
    		   }

    		   private static char[] generateOTP(int length) {
    		      String numbers = "1234567890";
    		      Random random = new Random();
    		      char[] otp = new char[length];

    		      for(int i = 0; i< length ; i++) {
    		         otp[i] = numbers.charAt(random.nextInt(numbers.length()));
    		    	
    		      }
    		      
    		      return otp;
    		   }
    		}

	
public static String autoGenerateNumber(int n) {
	String AlphaNumericString = "0123456789";
	StringBuilder sb = new StringBuilder(n);
	for (int i = 0; i < n; i++) {
		int index = (int) (AlphaNumericString.length() * Math.random());
		sb.append(AlphaNumericString.charAt(index));
	}
	return sb.toString();
}
}*/
	
	
	public static void autoGenerateNumber() {
		
		String AlphaNumericString = "0123456789";		
	int	length = AlphaNumericString.length();
		
	System.out.println(length);
	}
	
	public static void main(String[] args) {
		
		
		
}
	
}
		