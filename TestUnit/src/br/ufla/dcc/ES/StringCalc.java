package br.ufla.dcc.ES;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringCalc {

	public static ArrayList<Integer> convertNumbers(String number) {
		ArrayList<Integer> numbers = new ArrayList<>();

		String numberS = number.replaceAll(" ", "");
		String numsConvert[] = numberS.split(",");

		for (String num : numsConvert) {
			numbers.add((int)Integer.parseInt(num));
		}

		return numbers;
	}

	public static boolean checkNegatives(ArrayList<Integer> number) {
		for (Integer integer : number) {
			if (integer < 0) {
				return true;
			}
		}

		return false;
	}

	public static void getNegatives(ArrayList<Integer> number) {
		System.out.print("Negatives Not Allowed: ");

		for (Integer integer : number) {
			if (integer < 0) {
				System.out.print(integer + " ");
			}
		}
	}

	public static int add(ArrayList<Integer> number) {
		int sum = 0;

		for (Integer integer : number) {
			sum += integer;
		}

		return sum;
	}

	@Test // Test Sum Ok
	public static void testSumNumber() {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(2);

		boolean equals = (add(numbers) == 3) ? true : false;

		assertEquals(true, equals);
	}

	@Test // Test Sum Number Negatives
	public static void testSumNegatives() {
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(-2);

		assertEquals(true, checkNegatives(numbers));
	}

	@Test // Test Sum With ,
	public static void testSumWithVirg() {
		String numberVirg = "1, 2";

		boolean equals = (add(convertNumbers(numberVirg)) == 3) ? true : false;

		assertEquals(true, equals);
	}

	public static void main(String[] args) {
		System.out.println("Digite os números:");

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		String numbers = in.nextLine();

		ArrayList<Integer> numbersConverted = convertNumbers(numbers);

		if (checkNegatives(numbersConverted)) {
			getNegatives(numbersConverted);
		} else {
			System.out.println(add(numbersConverted));
		}

		testSumNumber();
		testSumNegatives();
		testSumWithVirg();
	}

}
