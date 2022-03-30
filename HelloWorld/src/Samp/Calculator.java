package Samp;

import java.util.Scanner;

public class Calculator {
	
	private int num1, num2;
	
	public void options () {
		
		Scanner choice = new Scanner(System.in);
		int n;
		
		do {
			
			System.out.println("Enter your options");
			System.out.println("1. Add");
			//System.out.println("2. Sub");
			//System.out.println("3. Multiply");
			//System.out.println("4. Quotient");
			//System.out.println("5. Remainder");
			System.out.println("6. Square");
			//System.out.println("7. Cube");
			//System.out.println("8. Square Root");
			//System.out.println("9. Cube Root");
			System.out.println("10. Quit");
			
			n = choice.nextInt();
			//calc(n);
			
			if (n < 1 && n > 10) {
				
				System.out.println("Wrong input");
				
			}
			
			else
				calc(n);
						
		}
		while (n > 0 && n < 10);
		
		/*if () {
			
			if (n == 10)
				System.out.println("Thank You!");
			
			else {
				
				
				options();
				
			}
			
		}*/
		
		
		
		choice.close();
		
	}
	
	private void calc(int a) {
		
		switch(a) {
		
		case 1:{
			
			get(a);
			System.out.println("Answer: " + add(num1, num2));
			break;
			
		}
		
		case 6:{
			
			get(a);
			System.out.println("Answer: " + square(num1));
			break;
			
		}
		
		case 10:{
			
			System.out.println("Thanks for using");
			break;
			
		}
		
		default: {
			
			System.out.println("Under maintanance");
			break;
			
		}
		
		}
		
	}
	
	private void get(int b) {
		
		Scanner g = new Scanner(System.in);
		
		if (b <= 5) {
			
			System.out.println("Enter number 1:");
			num1 = g.nextInt();
			System.out.println("Enter number 2:");
			num2 = g.nextInt();
		}
		
		else {
			
			System.out.println("Enter number 1:");
			num1 = g.nextInt();
						
		}
		
		//g.close();
		
	}
	
	private int add(int x, int y) {
		
		return x + y;
		
	}
	
	private int square(int x) {
		
		return x * x;
		
	}

}
