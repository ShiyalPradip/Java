import java.util.Scanner;

class Calc{

	public static void main(String args[]){
		
		Scanner Object = new Scanner(System.in);

		int Answer = 0;
 
		System.out.print("Enter a First Number: ");
		int Num1 = Object.nextInt();

		System.out.print("Enter a Second Number: ");
		int Num2 = Object.nextInt();	

		System.out.println("Select Operatiin : 1) Addition 2) Subtraction 3) Multiplication  4) Division");
		int Oper = Object.nextInt();

		switch(Oper){
			case 1:  System.out.println("Addition Is "+ (Num1+Num2)); break;
			case 2:  System.out.println("Subtraction Is "+ (Num1-Num2)); break;
			case 3:  System.out.println("Multiplication Is "+ (Num1*Num2)); break;
			case 4:  System.out.println("Division Is "+ (Num1/Num2)); break;
			default: System.out.print("Invailid Input....");
		}
		
	}
}