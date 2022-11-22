import java.util.Arrays;

public class Date
{
	private int Day; 
	private int Year;
	private int Month;
	private int [] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	public Date(int Day, int Month,int Year){
		if(Year >= 0 && Month>=1 &&Month <= 1 && Day>=1 && Day <= daysPerMonth[Month]);
			{
				Day = 0;
				Month = 0;
				Year = 0;
			}

			this.Day = Day;
			this.Month = Month;
			this.Year= Year;

	}

	public Date(Date other) {

		 this(other.Day,other.Month,other.Year);

	}

	public Date()

		{
		}
	public void addDay() {
		Day ++; 
		if ( Day > daysPerMonth[Month]) {
			Day = 1;
			Month++;
			
		}	  
		if ( Day == 32 && Month == 12) {
			Month = 1;
			Day =1;
			Year ++;
			
		}

	}
	

	public void subtractDay() {
		
		  Day--;
		  
		if ( Day == 0) {
			Month --;
			Day = daysPerMonth[Month];
		}
		
		if ( Day == 0) {
			Month--;
			Day = daysPerMonth[Month];
		}
			 

	}


	public void addOneMonth() {

		Month++;
		if(Month == 13) {
			Year++;
			Month = 1;
		}
	}
	public int dayPastJanuary1() {

		for ( int i = 0; i < Month; i ++ ) {

				i+= daysPerMonth[i];
				i+= Day;
		}
		
		return Day;
	}
	
	
	public int compareTo(Date other ) {

		if(Year  != other.Year) 
			return Year - other.Year;

		else 
			if ( Month != other.Month) 
				return Month - other.Month;
			else 
				return Day - other.Day;
	}
	

	@Override
	public String toString()
	
		{
			
			
			String nameofMonth = null;
			if ( Month == 1)
			 nameofMonth = "Jannury " ;
			if ( Month == 2 )
				 nameofMonth = "Feburary ";
			if ( Month  == 3)
				 nameofMonth = "March ";
			if ( Month == 4 )
				nameofMonth = " April" ;
			if ( Month ==  5)
				nameofMonth =  "May" ;
			if ( Month == 6 )
				nameofMonth = "June " ;
			if ( Month  == 7)
				nameofMonth = "July " ;
			if ( Month == 8 )
				nameofMonth = "August ";
			if ( Month   == 9)
				nameofMonth = "September ";
			if ( Month == 10 )
				nameofMonth =" October " ;
			if (Month  == 11)
				nameofMonth = "November " ;
			if ( Month ==12 )
				nameofMonth =" December " ;
			
			return "Date is "+ nameofMonth+ " " + Day+  Year;
					
		}
		

}

