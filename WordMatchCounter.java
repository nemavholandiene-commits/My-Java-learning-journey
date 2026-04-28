/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordmatchcounter;

/**
 *
 * @author Nemavhola NDIENE
 */
import java.util.Scanner;

public class WordMatchCounter{
	public static void main(String [] args ){
		
		Scanner sc = new Scanner(System.in);
		
		String name = "code";
		
		int result  = name.length();
		
		System.out.print("Please enter any 4 word you want : ");
		String naming = sc.nextLine();
		
		int results = naming.length();
		
		if(naming.equalsIgnoreCase("code")){
			System.out.println("Perfect match ");
		}
		
		else if(result == results){
			System.out.print("Close ");
		}
		else{
			System.out.print("Not close");
	}
}
}
/* Also we can achieve the first ELSE IF using this one 
		
		else if (naming.length() == name.length()) {
            System.out.println("Close");
*/	