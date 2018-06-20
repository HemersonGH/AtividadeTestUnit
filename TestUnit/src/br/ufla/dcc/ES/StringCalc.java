package br.ufla.dcc.ES;

public class StringCalc {

	public static int add(String number) {

		int sum = 0;

		String numb = number.replaceAll(" ","");
		numb = numb.replaceAll("\n","");

		String a[] = numb.split(",");

		ArrayList numberNeg = new ArrayList<Integer>;

		for (String num : a) {
			sum += Integer.parseInt(num);

			if (num < 0) {
				numberNeg.add(num);
			}

		}

		if (!numberNeg.isEmpty()) {
			System.out.print("Negatives not allowed: ");

			for (Integer numNeg : numberNeg) {
				System.out.print(numNeg + ", ");
			}
		}

		String total = number.replaceAll(" ","");
		total = total.replaceAll(",", " + ");

		System.out.print(total + " = ");

		return sum;

	}

	// Test Sum Ok

	// Test Sum Number Negatives

	// Test Sum Delimiter /n

	// Test Sum With Space

	// Test Sum With ,

	public static void main(String[] args) {

		System.out.println(add("1,   2, 3"));

	}

}
