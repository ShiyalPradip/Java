import java.util.*;
public class Calc2 {
	public static void main (String[] args) {
		Scanner Reader = new Scanner(System.in);
		
		System.out.print("Entr a First Number : ");
		double  Number1 = Reader.nextDouble();
		
		System.out.print("Entr a Second Number : ");
		double  Number2 = Reader.nextDouble();
		
		System.out.print("Enter Your Choice (+, -, *, / ): ");
		char Operator = Reader.next().charAt(0); 
			
		double Answer=0;
		
		switch (Operator ) {
    		case '+': Answer = Number1 + Number2; break;
    		case '-': Answer = Number1 - Number2; break;
    		case '*': Answer = Number1 * Number2; break;
    		case '/': Answer = Number1 / Number2; break;
    		default : System.out.print("Erro !! Operator Is Not Valid...");
		}
		
		System.out.printf("%.1f %c %.1f = %.1f", Number1, Operator, Number2, Answer);
	}	 
}