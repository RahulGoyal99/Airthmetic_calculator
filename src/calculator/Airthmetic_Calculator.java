package calculator;

import java.util.Scanner;


public class Airthmetic_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		while (true) {
			System.out.println("Which Airthmetic Operation you want to do : ");
			System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Modulous\n6. Exit");
			int num1, num2, n;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Your Answer");
			n = sc.nextInt();
			
			if (n == 1) {
				System.out.println("enter the first number: ");
				num1 = sc.nextInt();
				System.out.println("enter the second number: ");
				num2 = sc.nextInt();
				System.out.println("Adding two number : "+ (num1 + num2) );
			}
			else if (n == 2) {
				System.out.println("enter the first number: ");
				num1 = sc.nextInt();
				System.out.println("enter the second number: ");
				num2 = sc.nextInt();
				System.out.println("Substracting two number : "+ (num1 - num2));
			}
			else if (n == 3) {
				System.out.println("enter the first number: ");
				num1 = sc.nextInt();
				System.out.println("enter the second number: ");
				num2 = sc.nextInt();
				System.out.println("Multiplication two number : "+ (num1 * num2));
			}
			else if (n == 4) {
				System.out.println("enter the first number: ");
				num1 = sc.nextInt();
				System.out.println("enter the second number: ");
				num2 = sc.nextInt();
				System.out.println("Dividing two number : "+ (num1 / num2));
			}
			else if (n == 5) {
				System.out.println("enter the first number: ");
				num1 = sc.nextInt();
				System.out.println("enter the second number: ");
				num2 = sc.nextInt();
				System.out.println("modulus two number : "+ (num1 % num2));
			}
			else if (n == 6){
				break;
				}
			else
				System.out.println("Enter Valid Operation");
		}
	}
	
}
