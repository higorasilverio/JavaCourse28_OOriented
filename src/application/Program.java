package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		double width = scanner.nextDouble();
		double height = scanner.nextDouble();
		Rectangle rect = new Rectangle(width, height);
		System.out.println("Area = " + String.format("%.2f", rect.area()));
		System.out.println("Perimeter = " + String.format("%.2f", rect.perimeter()));
		System.out.println("Diagonal = " + String.format("%.2f", rect.diagonal()));
		
		scanner.close();
	}

}
