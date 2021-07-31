import java.util.Arrays;

public class ArrraySum {

	public static void main(String[] args) {
		int ar1[]= {2,34,444,5,5,56,66,767,7,78,8,8,435326,6,6,62};
		System.out.println(ar1[2]);
		
		System.out.println(Arrays.toString(ar1));
		
		System.out.println("Contents of array using for loop");
		
		for (int i =0 ; i <ar1.length; i++) 
		{
			System.out.println(ar1[i]);
			
			
		}
		
		// Maximum  Nth value problem task 1
		
		int max=ar1[0];
		for (int i =0 ; i <ar1.length; i++) {
			if (ar1[i]>max) {
				max=ar1[i];
				}
			
		}
		System.out.println("maximum Nth value is ="+max);
		
		//Remove Duplicates from array
		
		
	}
}
