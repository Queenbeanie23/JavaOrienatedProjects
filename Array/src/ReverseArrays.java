
public class ReverseArrays {
	

	public static void  reverseArray(int[] newArray) {
		int i, temp;
		
		//inv i= n
		
		for(i = 0; i < newArray.length/2 ; i++) {

			// inv: i is being initialize as the index start of the array
			
		      temp = newArray[i];
		     // inv: we are taking the length - index - 1 storing into newArray[i]
		      
		       
		      newArray[i] = newArray[newArray.length - i -1];
		      
		       
		       newArray[newArray.length-i-1] = temp ;
		       
		       // inv i=n
		  
		       	
		    }
		
	}


	public static void main(String[] args) {
		  
			int [] newArray1 = { 1,2,3,4,5,6,7};
			reverseArray(newArray1);
			
			for(int i = 0 ; i < newArray1.length; i++) {
		System.out.println( newArray1[i] +"  " );
		
		
			}
			
	}

	
}

