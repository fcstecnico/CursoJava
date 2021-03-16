package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.printf("ENTER RADIUS: "); 
		Calculator calc = new Calculator (); 
		
		double radius = sc.nextDouble(); 
		double c = calc.circuference(radius); 
		double v = calc.volume(radius); 
		System.out.printf("Circunference: %.2f%.n", c);
		System.out.printf("Volume: %.2f%.n", v);
		System.out.printf("PI value : %.2f%.n", calc.PI);
				
		sc.close();
		

	}
	

}
