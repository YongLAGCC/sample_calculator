package Calculator;
import java.util.*;

// A = 2
// B = 3
// Y = (A+B)*(A+B)
// AB+AB++
// 
// Author: Yong, Zhou; MAC 286; LAGCC
public class Main {
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in); 
		s3 table = new s3 (100);	
		
		System.out.println("Enter:" );
		char A = input.next().charAt(0); // input upper case A  
		String equal1 = input.next();	// =
		String a = input.next();       // input number
		int a1 =Integer.valueOf(a);
		
				
		table.add(A, a1);
		int n1= 0 ;
		n1 = table.getInt(A);
//		
		System.out.println("Enter:" );
		char B = input.next().charAt(0);// input upper case letter B
		String equal2 = input.next();	// =  (a space between a input)
		String b = input.next(); 
		int b1 =Integer.valueOf(b);     // number
		
		table.add(B, b1);
		
		String A3 = input.next(); 
		String equal3 = input.next();
		String s1 = input.next(); 		//String s1 = "(4+5)*(4-5)";
		// Infix -> postfix
		InToPost theTrans = new InToPost(s1);
		String s2 = theTrans.doTrans(); // do the translation
		System.out.println("Postfix is " + s2 + '\n'); // S2 = postfix

		// postfix -> answer
		ParsePost aParser = new ParsePost(s2);
		aParser.useSimpleTable('A', a1);
		aParser.useSimpleTable('B', b1);
	
		int w = aParser.doParse(); // do the evaluation
		System.out.println("Evaluates to " + w);		//answer = -9
		

	}
}
