import java.util.Scanner;

public class UsernameChecker{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
	
	String name = "Ndiene";
	
	System.out.print(" What is your username : ");
	String naming = sc.nextLine();
	
	if(name.equals(naming)){
		System.out.print(" Welcome Ndiene ");
	}
	else{
		System.out.print("Unknown user");
	}
	}
}
		