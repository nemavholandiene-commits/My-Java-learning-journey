import java.util.Scanner;

public class CaseSensitivityTest{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		String language = "java";
		
		System.out.print(" Which language do you use to code :");
		String languages = sc.nextLine();
		
if(language.equals(languages)){
	System.out.print("It is correct");
}
else{
	System.out.print("Almost correct ( case matters)");
}
	}
}

		
		


		