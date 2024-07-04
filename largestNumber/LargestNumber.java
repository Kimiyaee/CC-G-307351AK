package largestNumber;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);

        // Eingabeaufforderung an den Benutzer
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        int num1 = scanner.nextInt();

        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        int num2 = scanner.nextInt();

        System.out.print("Bitte geben Sie die dritte Zahl ein: ");
        int num3 = scanner.nextInt();

        // Ermitteln der größten Zahl
        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Ausgabe der größten Zahl
        System.out.println("Die größte Zahl ist: " + largest);

        scanner.close();
    }


	}


