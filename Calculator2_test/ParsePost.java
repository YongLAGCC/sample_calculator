package Calculator2_test;

class ParsePost {
	private StackXX theStack;
	private String input;
	private s5String sTable;

	// --------------------------------------------------------------
	public ParsePost(String s) {
		input = s;
		sTable = new s5String(88);
	}

	public void useSimpleTable(char x, int y){
		sTable.add(x, y);
	}
	
	public int doParse() {
		theStack = new StackXX(20); // make new stack
		char ch;
		String s1;
		int j;
		int num1, num2, interAns;
		for (j = 0; j < input.length(); j++) // for each char,
		{
			ch = input.charAt(j); // read from input
//s2 = Character.toString(ch);
			theStack.displayStack("" + ch + " "); // *diagnostic*
			if (ch >= '0' && ch <= '9') // if it's a number
				theStack.push((int) (ch - '0')); // push it
			
			 else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <='Z'  ) // if it's a number
				theStack.push(sTable.getInt(ch)); // push it
			else // it's an operator
			{
				num2 = theStack.pop(); // pop operands
				num1 = theStack.pop();
				switch (ch) // do arithmetic
				{
				case '+':
					interAns = num1 + num2;
					break;
				case '-':
					interAns = num1 - num2;
					break;
				case '*':
					interAns = num1 * num2;
					break;
				case '/':
					interAns = num1 / num2;
					break;
				default:
					interAns = 0;
				} // end switch
				theStack.push(interAns); // push result
			} // end else
		} // end for
		interAns = theStack.pop(); // get answer
		return interAns;
	} // end doParse()
} // end class ParsePost
// //////////////////////////////////////////////////////////////