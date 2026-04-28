/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userprofileprogram;

/**
 *
 * @author NEMAVHOLA NDIENE
 */
import java.util.Scanner;

public class UserProfileProgram{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" What is your name? : ");
		String name = sc.nextLine();
		
		System.out.print(" how old are you? : ");
		int age = sc.nextInt();
		
		System.out.print(" What is your height: ");
		double height = sc.nextDouble();
		
		System.out.println("Your name is " +name );
		System.out.println("You are " + age + " years old");
		System.out.println("You are " + height +" meters tall" );
		
	}
}
