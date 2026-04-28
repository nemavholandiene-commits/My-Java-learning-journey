/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yesnosystem;

/**
 *
 * @author NEMAVHOLA NDIENE
 */
import java.util.Scanner;

public class YesNoSystem{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Do you want to continue? (yes/no) : ");
		String acceptance = sc.nextLine();
				
if(acceptance.equalsIgnoreCase("Yes")){
	System.out.print(" Continue");
	
	
}
else if(acceptance.equalsIgnoreCase("No")){
	System.out.print(" Exit"); 
}
else{
	System.out.print(" Invalid input");
}
	}
}

