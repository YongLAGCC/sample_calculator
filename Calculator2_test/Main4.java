package Calculator2_test;
import java.util.*;

// A = 2
// B = 3
// Y = (A+B)+(A+B)
// AB+AB++
// 

public class Main4 {
	public static void main(String[] args)
	{
		
		//		SimpleTable table = new SimpleTable(100);
		//table.add("A", 1);
		//table.add("B", 10);
		//table.add("C", 100);

//		int x =table.getInt("A");
//		int y =table.getInt("B");
//		int z =table.getInt("C");
//		System.out.println("x ="+x );
//		System.out.println("y ="+y );		
//		System.out.println("z ="+z);
//		
		//String s1 = "4+5";
		
		
		String s1 = "(A-B)*(A+B)";
		
		// Infix -> postfix
		InToPost theTrans = new InToPost(s1);
		String s2 = theTrans.doTrans(); // do the translation
		System.out.println("Postfix is " + s2 + '\n'); // S2 = postfix

		// postfix -> answer
		ParsePost aParser = new ParsePost(s2);
		aParser.useSimpleTable('A', 2);
		aParser.useSimpleTable('B', 1);
		

		
		int w = aParser.doParse(); // do the evaluation
		System.out.println("Evaluates to " + w);		//x = answer
		

	}
}
