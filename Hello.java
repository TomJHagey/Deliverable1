package LearningJava;

import java.util.Scanner;

public class Hello {
	
	public static void main(String [] args) {
		
		  Scanner input = new Scanner(System.in); 
		  
	       
	        System.out.print("Please, enter your event type (type one of these options: casual, semi-formal, formal): ");
	        String eventType = input.nextLine();
	  
	        
	        switch (eventType) {
	        case "casual":
	        	System.out.println("Suggestion 1: Since your event is casual, you should serve sandwiches.\n");
	        	break;
	        case "semi-formal":
	        	System.out.println("Suggestion 1: Since your event is semi-formal, you should serve fried chicken.\n");
	        	break;
	        case "formal":
	        	System.out.println("Suggestion 1: Since your event is formal, you should serve chicken parmesan.\n");
	        }
	        
	        System.out.print("Now, please enter your party size:");
	        
	        int partySize = 0;
	        partySize = input.nextInt();
	        
	        if (partySize < 2) {
	        	System.out.println("Suggestion 2: Since your party size is only one, prepare the food in the microwave.\n");
	        }
	        else if (partySize  < 13) {
	        	System.out.println("Suggestion 2: Since your party size is between two and 12, prepare the food in your kitcken.\n");
	        }
	        else if (partySize > 12) {
	        	System.out.println("Suggestion 2: Since your party size is greater than 12, let a caterer prepare the food.\n");
            }
	        String Result = "Result";
	       System.out.print(Result + ": Please, combine Suggestion 1 with Suggestion 2 to retrieve appropriate eating directions. Thank you!\n");
	              
	       //investigate something this later
	       
	       /*  String eventType;
	                if (partySize < 2 && partySize == 2) {
	                    eventType = ("casual");
	        }
	                else if (partySize == 3 && partySize > 12) {
	                    eventType = ("semi-formal");
	        }
	                else if (partySize < 13) {
	                    eventType = ("formal");    
	            
	         
	            String mealSuggestion;
	            if (partySize < 2 && partySize == 2) {
	                mealSuggestion = ("sandwiches");
	    }
	            else if (partySize > 3 && partySize > 12) {
	                mealSuggestion = ("fried chicken");
	    }
	            else if (partySize < 13){
	                mealSuggestion = ("chicken parmesan");        
	                
	                
	    
		
	                if (partySize < 2 && partySize ) {
	                    prepSuggestion = ("in the microwave");
	        }
	                else if (partySize > 3 && partySize > 13) {
	                    prepSuggestion = ("by a caterer");
	        }
	                else if (partySize < 13){
	                    prepSuggestion = ("in your kitchen");
	                    
	        }
	                System.out.println("You're hosting a " + eventType + " event for " + partySize + " participants, you should serve " + mealSuggestion + " preparped " + prepSuggestion);
	                //System.out.println("You're hosting a " + eventTypeTwo + " event for " + partySize + " participants, you should serve " + mealSuggestionTwo + " preparped " + prepSuggestion);
	                //System.out.println("You're hosting a " + eventTypeThree + " event for " + partySize + " participants, you should serve " + mealSuggestionThree + " preparped " + prepSuggestion);
	                
	    */

	            }
	            }

		
		
		
	

