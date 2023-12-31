class MultipaleCmdLine{

	public static void main(String args[]){
		if(args.length > 0){
			System.out.println("Command Lien Arguments Ars: ");

			for(String Value : args){
				System.out.println(Value);
			}
		}else{
			System.out.println("No Command Line Available");
		}
	}
}