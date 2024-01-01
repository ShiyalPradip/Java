import java.util.*;

public class SwitchCase {

    public static void main (String[] args) {
		Scanner Day = new Scanner(System.in);
		
		System.out.print("Enter a Day : ");
		int Today = Day.nextInt();
		
		switch(Today){
			case 1 : System.out.print("Today Is Monday"); break;
			case 2 : System.out.print("Today Is Tuesday"); break;
			case 3 : System.out.print("Today Is Wednesday"); break;
			case 4 : System.out.print("Today Is Thursday"); break;
			case 5 : System.out.print("Today Is Friday"); break;
			case 6 : System.out.print("Today Is Saturday"); break;
			case 7 : System.out.print("Today Is Sunday"); break;
			default : System.out.print("Invalid Day Entered..."); 
		}	
	}  
}