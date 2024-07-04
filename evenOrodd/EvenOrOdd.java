package evenOrodd;

import java.util.Scanner;

public class EvenOrOdd {
	 
	    public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	        // Eingabeaufforderung an den Benutzer
	        System.out.print("Bitte geben Sie eine Zahl ein: ");
	        int number = scanner.nextInt();

	        // die Zahl gerade oder ungerade ist
	        
	        if (number % 2 == 0) {
	            System.out.println("Gerade");
	        } else {
	            System.out.println("Ungerade");
	        }

	        // Scanner schließen
	        scanner.close();
	        
	       
	    			
	    			
	    
	    	
	    	
	    }
	}

