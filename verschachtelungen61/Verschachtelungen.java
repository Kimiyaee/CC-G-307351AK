package verschachtelungen61;

public class Verschachtelungen {

	public static void main(String[] args) {

		
		        // Tägliche Temperaturen für 3 Städte (7 Tage)
		        double[][] temperatures = {
		            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
		            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
		            {25.1, 26.5, 24.3, 23.8, 27.2, 25.0, 24.7}  // Stadt 3
		        };

		        // Berechnen und Ausgeben der durchschnittlichen Temperaturen
		        for (int stadt = 0; stadt < temperatures.length; stadt++) {
		            double summe = 0;
		            for (int tag = 0; tag < temperatures[stadt].length; tag++) {
		                summe += temperatures[stadt][tag];
		            }
		            double durchschnitt = summe / temperatures[stadt].length;
		            System.out.printf("Die durchschnittliche Temperatur von Stadt %d ist %.2f Grad.\n", stadt + 1, durchschnitt);
		      
		}

		
	}

}
