package arravs;
import java.util.ArrayList;
import java.util.List;

public class Arrays523 {

	public static void main(String[] args) {
		
		
		        int[] array = {1, 5, 3, 9, 7, 9, 4};

		        // Größtes Element und seine Indizes finden
		        Result result = findMaxAndAllIndices(array);

		        // Ergebnis ausgeben
		        System.out.println("Das größte Element im Array ist: " + result.max);
		        System.out.println("Die Indizes der größten Elemente sind: " + result.indices);
		    }

		    public static Result findMaxAndAllIndices(int[] array) {
		        int max = array[0];
		        List<Integer> indices = new ArrayList<>();
		        indices.add(0);

		        for (int i = 1; i < array.length; i++) {
		            if (array[i] > max) {
		                max = array[i];
		                indices.clear();
		                indices.add(i);
		            } else if (array[i] == max) {
		                indices.add(i);
		            }
		        }

		        return new Result(max, indices);
		    }
		}

		class Result {
		    int max;
		    List<Integer> indices;

		    Result(int max, List<Integer> indices) {
		        this.max = max;
		        this.indices = indices;
		   
	}

}
