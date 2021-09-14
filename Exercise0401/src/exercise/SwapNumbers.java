/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SwapNumbers {
    public static void main(String[] args) {
			SwapNumbers swapNumbers = new SwapNumbers();
			Scanner scanner = new Scanner(System.in);
			System.out.print("Input number 1: ");
			int num1 = Integer.parseInt(scanner.nextLine()); // Input the integer num1 with an integer, scanner is for input line
			System.out.print("Input number 2: ");
			int num2 = Integer.parseInt(scanner.nextLine());// Input the integer num2 with an integer, scanner is for input line
			System.out.println("Before swap: num1 = " + num1 + ", num2 = " + num2);
			swapNumbers.swap(num1, num2);
			System.out.println("After swap: num1 = " + num1 + ", num2 = " + num2);
		}
	
		public void swap(int num1, int num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("In swap: num1 = " + num1 + ", num2 = " + num2);
		}
}
