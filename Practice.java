import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
		int my_array[] = {1,8,4,6};
		String my_array2[] = {"Abhay","C","Java","Python","f","g"};
		//Arrays.toString(my_array);
		System.out.println("Orginal numeric " + Arrays.toString(my_array));
		Arrays.sort(my_array);
		System.out.println(Arrays.toString(my_array));
		System.out.println("Orginal numeric " + Arrays.toString(my_array2));
		Arrays.sort(my_array2);
		System.out.println(Arrays.toString(my_array2));
	
		
	}

}
