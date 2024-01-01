import java.util.Scanner;

class GetinputFromUser{
	public static void main(String args[]){

		Scanner Obj = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		String Str = Obj.nextLine();		

		System.out.println("Enter Your Age: ");
		int Age = Obj.nextInt();		
		
		System.out.println("Enter Your Per: ");
		float Per= Obj.nextFloat();		
		
		System.out.println("Your Name Is: "+Str);
		System.out.println("Your Age Is: "+Age);
		System.out.println("Your Per Is: "+Per);
	}
}