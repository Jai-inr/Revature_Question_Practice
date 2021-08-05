package solutions;

public class Hypotenuse_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hypotenuse_solution h1= new Hypotenuse_solution();
		
		h1.hypotenuseof(4, 3);

	}

	public void hypotenuseof(int a,int b) {
		
		double c;
		
		c=(a*a)+(b*b);
		
		System.out.println("Square of c is = "+Math.sqrt(c));
		
	}
}
