package RegularExpression;

import java.util.regex.Pattern;

public class ValidationOfEmail {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[a-zA-Z0-9.]+[@]{1}[gmail]*[yahoo]*\\.[com]*[org]*[edu]*","mayur.jangale2013@gmail.com"));//true
		System.out.println(Pattern.matches("[a-zA-Z0-9]+[@]{1}[gmail]*[yahoo]*\\.[com]*[edu]*[org]*","rutujasuryawanshi@gmail.com"));//true
		
	}

}
