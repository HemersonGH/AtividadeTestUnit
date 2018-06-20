package br.ufla.dcc.ES;

public class StringCalc {

	public static int add(String number) {

		int sum = 0;
		
		String numb = number.replaceAll(" ","");
		
		String a[] = numb.split(",");

		for (String num : a) {
			sum += Integer.parseInt(num);
			
		}
		
		String total = number.replaceAll(" ","");
		total = total.replaceAll(",", " + ");
		
		System.out.print(total + " = ");
		
		return sum;

	}

	public static void main(String[] args) {

		System.out.println(add("1,   2, 3"));

	}

}
