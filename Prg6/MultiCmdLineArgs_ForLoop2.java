class MultiCmdLineArgs_ForLoop2{

	public static void main(String args[]){
		if(args.length > 0){
			System.out.println("Command Line Arguments Are: ");

			for(String Value : args){
				System.out.println(Value);
			}			
		}else{
			System.out.println("No Command Line Available");
		}
	}
}