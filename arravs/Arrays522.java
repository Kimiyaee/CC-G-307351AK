package arravs;

public class Arrays522 {

	public static void main(String[] args) {

		
		        int[] array = {1, 5, 3, 9, 7, 9, 4};

		        // Größtes Element und seinen Index finden
		        int[] result = findMaxAndIndex(array);

		        // Ergebnis ausgeben
		        System.out.println("Das größte Element im Array ist: " + result[0]);
		        System.out.println("Der Index des größten Elements ist: " + result[1]);
		    }

		    public static int[] findMaxAndIndex(int[] array) {
		        int max = array[0];
		        int maxIndex = 0;
		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i];
		                maxIndex = i;
		            }
		        }
		        return new int[]{max, maxIndex};
		  
		
	}

}
