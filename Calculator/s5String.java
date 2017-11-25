package Calculator;

import java.util.Stack;

public class s5String {

	public char[] ArrayStr;
	public int[] ArrayInt;
	int element = 0;
	public int totalEle;

	s5String(int size) {

		this.totalEle = size;
		ArrayStr = new char[totalEle];
		ArrayInt = new int[totalEle];

	}

	public void add(char var_key, int value) {

		for (int i = 0; i < totalEle; i++) {
			if (ArrayStr[i] == var_key) {
				ArrayInt[i] = value;
				break;
			} else {
				ArrayStr[element] = var_key;
				ArrayInt[element] = value;
			//	System.out.println("Sing :trr" + ArrayStr[i] + "  equal :" + ArrayInt[i]);
				this.element++;
				break;
			}
		}

	}

//	public void add2(char var_key, int value) {
//
//		ArrayStr[element] = var_key;
//		ArrayInt[element] = value;
//		System.out.println("STring :" + ArrayStr[element] + "  equal :" + ArrayInt[element]);
//		this.element++;
//	}

	public void lookup(char x) {
		for (int i = 0; i < element; i++) {
			if (ArrayStr[i] == x)
				System.out.print(ArrayInt[i]);
		}
	}

//	public void display() {
//
//		System.out.print("Display this array. \n");
//		for (int i = 0; i < element + 1; i++) {
//			System.out.print(ArrayStr[i] + " is: " + ArrayInt[i] + "\n");
//		}
//	}

	public int getInt(char x) {

		for (int i = 0; i < totalEle; i++) {
			if (ArrayStr[i] == x) {
				return ArrayInt[i];
			}
		}
		return -1;

	}

	
}