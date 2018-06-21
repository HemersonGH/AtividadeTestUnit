package br.ufla.dcc.ES;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCalc {
	
	public ArrayList<Integer> convertNumbers(String number){
		ArrayList<Integer> numbers = new ArrayList<>();
		
		String numb = number.replaceAll(" ", "");
		numb = numb.replaceAll("\n", "");

		String a[] = numb.split(",");

		for (String num : a) {
			numbers.add(Integer.parseInt(num));
		}

		return numbers;
	}
	
	public void checkNegatives(ArrayList<Integer> number) {
		ArrayList<Integer> numbersNeg = new ArrayList<>();
		
		for (Integer integer : number) {
			if (integer < 0) {
				numbersNeg.add(integer);
			}
		}
		
		if (!numbersNeg.isEmpty()) {
			System.out.print("Negatives Not Allowed: ");
			
			for (Integer integer : numbersNeg) {
				System.out.print(integer + " ");
			}
		}
	}

	public static int add(ArrayList<Integer> number) {

		int sum = 0;
		
		for (Integer integer : number) {
			sum =+ integer;
		}		
		
		return sum;
	}

	// Test Sum Ok
	public void testSumNumber() {
		
	}

	// Test Sum Number Negatives
	public void testSumNegatives() {
		
	}
	
	// Test Sum Delimiter /n
	public void testSumWithDelimiter() {
		
	}
	
	// Test Sum With Space
	public void testSumWithSpace() {
		
	}
	
	// Test Sum With ,
	public void testSumWithVirg() {
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Digite os números:");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String numbers = in.nextLine();
		
		
		
	}

}
