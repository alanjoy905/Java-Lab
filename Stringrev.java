package Lab21;
import java.util.*;
public class revstring   
{    
    public static void main(String[] args) 
    {
    	String reversed="";
    
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the string to reverse:");
    	
        String orginal = sc.nextLine(); 
        
        orginal=orginal.toLowerCase();
              
        for(int i = orginal.length()-1; i >= 0; i--)
        {    
           reversed = reversed + orginal.charAt(i);    
        }    
        
      
        
        sc.close();
            
        System.out.println("Original string: " + orginal);    
       
        System.out.println("Reverse of given string: " + reversed); 
        if(orginal.equals(reversed))
        {
        	System.out.println("The given string is palindrom: "+reversed);
        }
        else 
        {
        	System.out.println("The given string is not palindrom: "+reversed);
        	
        }
    }    
}    
