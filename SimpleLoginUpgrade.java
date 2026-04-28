/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleloginupgrade;

/**
 *
 * @author Nemavhola NDIENE
 */
import java.util.Scanner;

public class SimpleLoginUpgrade{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		String username = "admin", password = "1234";
		
		System.out.print(" What is your username : ");
		String user = sc.nextLine();
		
		System.out.print(" Please enter your password : ");
		String pass = sc.nextLine();
		
		if(username.equals(user) && password.equals(pass)){
			System.out.print("Login successful");
		}
		else if(username.equals(user)){
			System.out.print("Wrong username");
		}
		else if(password.equals(pass)){
			System.out.print("Wrong password");
		}
		else{
			System.out.print("Retry Login");
		}
		
	}
}
