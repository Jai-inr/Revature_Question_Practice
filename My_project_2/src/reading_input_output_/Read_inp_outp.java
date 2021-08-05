package reading_input_output_;

import java.util.Scanner;
import java.util.Arrays;

public class Read_inp_outp {
	
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your name =");
	   String name = sc.nextLine();
	   
	   
	   System.out.println("Enter your age =");
	   int age =Integer.parseInt(sc.nextLine());
	   
	   System.out.println("Enter the Size of Array");
	   int n=sc.nextInt();
	   
	   int a[]=new int[n];
	   
	   System.out.println("Enter " + n + " elements");
	   
	   for (int i=0;i<n;i++) {
		   
		   a[i]=sc.nextInt();
	   }
	   
	   
	   System.out.println("contents of array ");
	   System.out.println(Arrays.toString(a));
	   
	   
	   
	   
	   System.out.println("Candidate name ="+name);
	   
	   System.out.println( "Candidates age ="+age );
	
}
}
