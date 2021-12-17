import java.util.Arrays;

public class Practice_2 {

	public static void main(String[] args) {
	     int my_array[] = {9,8,6,4};
	     int sum = 0;
	     for(int i : my_array) {
	    	 sum = sum + i;
	    	
	     }
	     System.out.println("Orginal numeric " + Arrays.toString(my_array));

	}

}
