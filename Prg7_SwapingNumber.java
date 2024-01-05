import java.util.*;

class SwapingNumber{

	static void Swap(int Number1, int Number2){

		Number1 = Number1 - Number2;
		Number2 = Number1 + Number2;
		Number1 = Number2 - Number1;

		System.out.println("First No Is : "+Number1);
		System.out.print("Second No Is : "+Number2);
	}

	public static void main(String args[]){
		
		Scanner Object = new Scanner(System.in);

		System.out.print("Enter a First Number: ");
		int Number1 = Object.nextInt();
		
		System.out.print("Enter a Second Number: ");
		int Number2 = Object.nextInt();

		Swap(Number1, Number2);
	}
}