//AUTHOR : YONG, ZHOU ; MAC 286
package postfix;
import java.io.*;
////////////////////////////////////////////////////////////////
class PostfixApp {
	public static void main(String[] args) throws IOException {
		String input;
		int output;
		while (true) {
			System.out.print("Enter postfix: ");
			System.out.flush();
			input = getString(); // read a string from kbd
			if (input.equals("")) // quit if [Enter]
				break;
			// make a parser
			ParsePost aParser = new ParsePost(input);
			output = aParser.doParse(); // do the evaluation
			System.out.println("Evaluates to " + output);
		} // end while
	} // end main()

	// --------------------------------------------------------------
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	// --------------------------------------------------------------
} // end class PostfixApp
// //////////////////////////////////////////////////////////////