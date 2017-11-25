package Calculator2_test;
import java.util.*;

// A = 2
// B = 3
// Y = (A+B)+(A+B)
// AB+AB++
// 

public class Main3 {
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter:" );
		
		
		String A1 = input.next(); 			// b
		String equal1 = input.next();		// =
		String b1 = input.next(); 			// 2
		
		
		String A2 = input.next(); 			// b
		String equal2 = input.next();		// =
		String b2 = input.next(); 			// 2
		
		int num2 = Integer.parseInt(b2);
	//	System.out.print(num2);

		String A3 = input.next(); 
		String equal3 = input.next();
		String b3 = input.next(); // B3 = (A+B)
		String s1 = "A+B";
		
		char d1 = A1.charAt(0);
		char d2 = A2.charAt(0);
		int e1 = Integer.parseInt(b1);
		int e2 = Integer.parseInt(b2);

		// Infix -> postfixa = a
		
		InToPost theTrans = new InToPost(s1);
		String s2 = theTrans.doTrans(); // do the translation
		System.out.println("Postfix is " + s2 + '\n'); // S2 = postfix

		// postfix -> answer
		ParsePost aParser = new ParsePost(s2);
		aParser.useSimpleTable(d1, e1);
		aParser.useSimpleTable(d2, e2);
		

		
		int w = aParser.doParse(); // do the evaluation
		System.out.println("Evaluates " + w);		//x = answer
		

	}
}
