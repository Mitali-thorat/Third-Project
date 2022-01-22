package com.readDataFromKeyboard;
import java.util.Scanner;


public class Example8 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("enter the redious:");
		
		double r= s.nextDouble();
		
		double area=(22*r*r)/7 ;
		System.out.println("area of the circle is:" +area);

		s.close();

	}

}
