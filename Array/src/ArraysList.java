import java.util.*;


public class ArraysList {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println( "Please enter 3 numbers");
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		
		System.out.println(min(a,b,c) + " "+ Middle(a,b,c)+  " " + Max(a,b,c));
	}
		 
	
public static int Middle( int a,int b, int c) {
	
      	
      	int middle = a+b+c - Max(a,b,c) - min(a,b,c) ;   
	return middle;
	}
public static int  Max( int a,int b,int c) {

  	int max = Math.max(a, Math.max(b,c));
  	return max;
}
	public static int min (int a, int b, int c) {

		int min = Math.min(a, Math.min(b ,c ));
		return min;
	}
	
	
 }

