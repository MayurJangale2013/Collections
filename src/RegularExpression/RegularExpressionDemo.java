package RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[acd]","a")); //true 
		System.out.println(Pattern.matches("[acd]","c")); //true
		System.out.println(Pattern.matches("[acd]","d")); //true
		System.out.println(Pattern.matches("[acd]","e")); //false
		System.out.println(Pattern.matches("[acd]","ac")); // false
		System.out.println(Pattern.matches("[acd]","acd")); //false
		System.out.println(Pattern.matches("[acd]","mnoa")); //false
		System.out.println(Pattern.matches("[^acd]","m")); //true
		System.out.println(Pattern.matches("[^acd]","a")); //false
		System.out.println(Pattern.matches("[a-zA-S]","U"));//false
		System.out.println(Pattern.matches("[a-zA-S]","B"));//true
		System.out.println(Pattern.matches("[a-zA-S]","z"));//true
		System.out.println("=".repeat(40));
		// {5}: Quantifier
		System.out.println(Pattern.matches("[SM][onali]{5}","Sonali"));//true
		System.out.println(Pattern.matches("[SM][onali]{5}","Monali"));//true
		System.out.println(Pattern.matches("[SM][onali]{5}","Donali"));//false
		System.out.println("=".repeat(40));
		//? : represents zero or one character
		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","")); // true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println(Pattern.matches("[xyz]?","xx")); //false
		System.out.println("=".repeat(40));
		//+ represents one or more character
		System.out.println(Pattern.matches("[xyz]+","x")); //true
		System.out.println(Pattern.matches("[xyz]+","xx")); //true
		System.out.println("=".repeat(40));
		//* zero or more characters in that range
		System.out.println(Pattern.matches("[xyz]*","xyyz")); //true
		System.out.println(Pattern.matches("[xyz]*","yyyyy")); //true
		System.out.println(Pattern.matches("[xyz]*","zzzz")); //true
		System.out.println(Pattern.matches("[xyz]*","xxyyzz")); //true
		System.out.println(Pattern.matches("[xyz]*","")); //true
		System.out.println(Pattern.matches("[xyz]*","xxdyyzz"));//false 
		System.out.println("=".repeat(40));
		//Metacharacter [0-9]
		System.out.println(Pattern.matches("\\d","1")); //true
		System.out.println(Pattern.matches("\\d{2}","12")); //true
		System.out.println(Pattern.matches("\\d{2}","56")); //true
		System.out.println("=".repeat(40));
		// \\d represents 0-9
		System.out.println(Pattern.matches("\\d{1,3}","1")); //true
		System.out.println(Pattern.matches("\\d{1,3}","23")); //true
		System.out.println(Pattern.matches("\\d{1,3}","567")); //true
		System.out.println(Pattern.matches("\\d{1,3}","8768")); //false
		System.out.println(Pattern.matches("\\d{1,5}","98765")); //true
		System.out.println("=".repeat(40));
		//w: [a-zA-Z0-9]
		System.out.println(Pattern.matches("\\w{1,3}","abc")); //true
		System.out.println(Pattern.matches("\\w{1,3}","abcde")); //false
		System.out.println(Pattern.matches("\\w{1,3}","ab1")); //true
		System.out.println(Pattern.matches("\\w{1,3}","123")); //true
		System.out.println(Pattern.matches("\\w{1,3}","ABC")); //true
		System.out.println(Pattern.matches("\\w{1,4}","abcd")); //true
		System.out.println("=".repeat(40));
		// \\D: [a-zA-Z]
		System.out.println(Pattern.matches("\\D","1")); //false
		System.out.println(Pattern.matches("\\D","12")); //false
		System.out.println(Pattern.matches("\\D","A")); //true
		System.out.println(Pattern.matches("\\D","a")); //true
		System.out.println(Pattern.matches("\\D","ab")); //false
		System.out.println("=".repeat(40));
		// . represents a single character
		System.out.println(Pattern.matches("..m","alm")); //true
		System.out.println(Pattern.matches("alm","alm")); //true
		System.out.println(Pattern.matches("alm","apq")); //false
		System.out.println(Pattern.matches("...","apq")); //true
		System.out.println("=".repeat(40));
		System.out.println(Pattern.matches(".o","monali")); //false
		System.out.println(Pattern.matches("[mo][onali]{5}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{4}","monali")); //true
		System.out.println(Pattern.matches(".o[nali]{5}","monali")); //false
		System.out.println("=".repeat(40));
		System.out.println(Pattern.matches("[xyz]?","xxx")); //false
		System.out.println(Pattern.matches("[xyz]?","x")); //true
		System.out.println(Pattern.matches("[xyz]?","y")); //true
		System.out.println(Pattern.matches("[xyz]?","z")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println("=".repeat(40));
		System.out.println(Pattern.matches("[xyz]*","x")); //true
		System.out.println(Pattern.matches("[xyz]*","xx")); //true
		System.out.println(Pattern.matches("[xyz]?","xy")); //false
		System.out.println("=".repeat(40));
		// write a program which is of 10 digit and starts with either 7/8/9
		// 7/8/9 552588168
		System.out.println(Pattern.matches("[789][0-9]{9}","7552588168")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","8552588168")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","9525881681")); //true
		System.out.println(Pattern.matches("[789][0-9]{9}","1552588168")); //false
		System.out.println(Pattern.matches("[789][0-9]{9}","955258")); //false
		System.out.println(Pattern.matches("[789][0-9]{9}","9552581234455555")); //false
		System.out.println("=".repeat(40));
		//eg: 197-267-3345
		System.out.println(Pattern.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{3}","955-258-876")); //true
		System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{3}","955-258-876")); //false
		System.out.println(Pattern.matches("[0-9]{3}[-]{2}[0-9]{3}[-]{1}[0-9]{3}","955--258-876")); //true
		System.out.println("=".repeat(40));
		
		// find character(uppercase aphabet) and contains lower case alphabet, only one digit allowed in betwen
//		[A-Z][ a-z]*[0-9][a-z]*
		System.out.println(Pattern.matches("[A-Z][a-z]*[0-9][a-z]*","Bcyber5success")); //true
		System.out.println("=".repeat(40));
		// validation of an email
		//sonali789@gmail.com or monali@gmail.org or cybersuccess@gmail.edu
		
//	System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}[gmail][\.][com|org|edu]","sonali123@gmail.com")); //true
//		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}[gmail]*[\\.][com|org|edu]*,"sonali123@gmail.com")); //true
//	System.out.println(Pattern.matches("[a-zA-Z0-9]+@gmail\\.[com]*[org]*[edu]*","sonali123@gmail.org")); //true	
	System.out.println(Pattern.matches("[a-zA-Z0-9.]+@gmail\\.[com]*[org]*[edu]*",
			"sonali.c123@gmail.com")); //true
	System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]gmail1\\.[com]*[org]*[edu]*",
			"sonali123@gmail.org")); //false
	System.out.println(Pattern.matches("[.a-zA-Z0-9]+[@]{1}[gmail]*[yahoo]*\\.[com]*[org]*[edu]*","mayur.jangale2013@gmail.com"));//true
	System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}[gmail]*[yahoo]*\\.[com]*[gov]*[edu]*","rutujasuryawanshi21@gmail.com"));
	

	}

}
