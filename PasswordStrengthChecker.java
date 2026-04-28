import java.util.Scanner;

public class PasswordStrengthChecker{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		String password = " 1234 "; 
		
		System.out.print(" Please enter a password :");
		String passwords = sc.next();
		
		if(password.equals(passwords)){
			System.out.print(" Weak password");
		}
		else{
			System.out.print(" Stronger password ");
		}
	}
}
		
		


		