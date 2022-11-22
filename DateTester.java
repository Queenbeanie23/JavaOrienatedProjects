import java.util.Scanner;
public class DateTester
	{

		public static void main(String[] args)
			{
				Date q = new Date(0,0,0) ;
				Date b1 = new Date(q);
				
				boolean done = false;

				Scanner in = new Scanner(System.in);

				while(!done) {
					System.out.println("1. constructor ");
					System.out.println("2. Date    ");
					System.out.println("3. addDay");
					System.out.println("4. subtractDay ");
					System.out.println("5. addOneMonth ");
					System.out.println("6. dayPastJanauary1 ");
					System.out.println("7. compareTo ");
					System.out.println("8. toString");

			
				
				switch(in.nextInt()) {
					
					case 1:						
							System.out.println("Please Enter Month: ");
							int Month = in.nextInt();
							System.out.println("Please Enter Day: ");
							int Day = in.nextInt();
							System.out.println("Please Enter Year: ");
							int Year = in.nextInt();
							q = new Date (Month,Day,Year);
							break;
										
					case 2:
						System.out.println("Please Enter the Other Month: ");
						int Month1 = in.nextInt();
						System.out.println("Please Enter the Other Day: ");
						int Day1 = in.nextInt();
						System.out.println("Please Enter the Other Year : ");
						int Year1 = in.nextInt();
						 b1 = new Date ( Month1, Day1, Year1);
					 
					 break;
					case 3:
					q.addDay();
					break;
					case 4:
					q.subtractDay();
					break;
					case 5:
						q.addOneMonth();
						break;
					
					case 6:
						System.out.println (" It has been " + q.dayPastJanuary1() + " days since January 1st");
						break;
					case 7:
						System.out.println(q.compareTo(b1));
						break;
					
					case 8 :
						System.out.println(q.toString());
						break;
						default :
							System.out.println("Error");
				}
			}
		

	}
	}

