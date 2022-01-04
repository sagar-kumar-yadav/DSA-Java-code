package com.String.Basic;

class integer_to_roman
{
	public static void main(String[] args) {
		int n = 5;
		System.out.println(convertToRoman(n));

	}
	static String convertToRoman(int n) {
		//code here
		String[] thousands = {"", "M", "MM", "MMM"};

		String[] hundreds = {"",  "C",  "CC",  "CCC",  "CD", "D", "DC", "DCC", "DCCC", "CM"};

		String[] tens = { "",  "X",  "XX",  "XXX",  "XL", "L", "LX", "LXX", "LXXX", "XC" };

		String[] units = { "",  "I",  "II",  "III",  "IV", "V", "VI", "VII", "VIII", "IX" };

		// converting to roman
		String th = thousands[n / 1000];
		String hn = hundreds[(n % 1000) / 100];
		String ten = tens[(n % 100) / 10];
		String un = units[n % 10];

		String ans = th+ hn + ten + un;

		return ans;

	}
}