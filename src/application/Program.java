package application;

import java.util.Scanner;

import model.entities.PrintService;


public class Program {

	public static void main(String[] args) {
		PrintService<Integer> print = new PrintService<>();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many values: ");
		
		int quantity = in.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			System.out.print("Value [" + i + "]: ");
			int value = in.nextInt();
			print.addValue(value);
		}
		
		print.printList();
		
		in.close();
	}

}
