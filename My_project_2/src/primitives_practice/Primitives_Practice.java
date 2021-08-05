package primitives_practice;

public class Primitives_Practice {

	public static void main(String[] args) {
		int x=99;
		float y=34f;
		long contact=37737849392L;
		boolean b=true;
		
		System.out.println("x = "+x );
		System.out.println("y = "+y);
		System.out.println("contact = "+contact);
		System.out.println("boolean = "+b);
		
		int m=1999194233;
		float s=m;
		System.out.println("s = " +s);
		long l=m;
		System.out.println("l = "+l);
		double d=m;
		System.out.println("d = "+d);
		
		//double can't be converted into float
		//float can't be converted in long 
		//
		
	//	double j=23.33;
		//a=(int) j;//explicit
//		System.out.println("a = "+a);
		
		
		
		int o=111;
		char t=(char)o; //explicit
		System.out.println("t = "+t);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		int q=0;
		boolean g=(boolean)b;
		System.out.println("g = " +g);
		
		//boolean can't be cast to any data types float , integer , double and long
		
	}

}
