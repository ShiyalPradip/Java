class MultiCmdLineArgs_ForLoop{

	public static void main(String args[]){
		if(args.length > 0){
			System.out.println("Command Lien Arguments Are: ");

			for(int i=0; i<args.length; i++){
				System.out.println(args[i]);
			}			
		}else{
			System.out.println("No Command Line Available");
		}
	}
}