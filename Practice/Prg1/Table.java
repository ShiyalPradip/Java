import java.util.Scanner;
public class Table {
	public static void main (String[] args) {
		Scanner Object = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int Number1 = Object.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(Number1+" * "+i+" = "+Number1*i);
		}
	} 
}