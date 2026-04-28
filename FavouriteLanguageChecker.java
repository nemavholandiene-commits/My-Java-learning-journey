/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.favouritelanguagechecker;

/**
 *
 * @author NEMAVHOLA NDIENE
 */
import java.util.Scanner;

public class FavouriteLanguageChecker{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your favourite coding language : ");
		String language = sc.nextLine();
		
		if(language.equalsIgnoreCase("Java")){
			System.out.print("Nice choice ");
		}
		else if (language.equalsIgnoreCase("Python")){
			System.out.print(" Easy but powerful ");
		}
		else if(language.equalsIgnoreCase("C++")){
			System.out.print("Fast but complex ");
		}
		else{
			System.out.print("Unknown language ");
		}
		
	}
}
