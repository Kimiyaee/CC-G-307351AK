package arravs;

public class Arrays521 {

	public static void main(String[] args) {

		
		        int[] array = {1, 5, 3, 9, 7, 9, 4};

		        // Größtes Element finden
		        int max = findMax(array);

		        // Ergebnis ausgeben
		        System.out.println("Das größte Element im Array ist: " + max);
		    }

		    public static int findMax(int[] array) {
		        int max = array[0];
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i];
		            }
		        }
		        return max;
		 
		
	}

}
