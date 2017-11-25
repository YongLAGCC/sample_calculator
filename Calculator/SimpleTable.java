package Calculator;

import java.util.Stack;

public class SimpleTable {

	public String[] ArrayStr;
	public int[] ArrayInt;
	int element = 0;
	public int totalEle;

	SimpleTable(int size) {

		this.totalEle = size;
		ArrayStr = new String[totalEle];
		ArrayInt = new int[totalEle];

	}

	public void add(String var_key, int value) {

		for (int i = 0; i < totalEle; i++) {
			if (ArrayStr[i] == var_key) {
				ArrayInt[i] = value;
				break;
			} else {
				ArrayStr[element] = var_key;
				ArrayInt[element] = value;
				System.out.println("STring :" + ArrayStr[i] + "  equal :" + ArrayInt[i]);
				this.element++;
				break;
			}
		}

	}

//	public void add2(String var_key, int value) {
//
//		ArrayStr[element] = var_key;
//		ArrayInt[element] = value;
//		System.out.println("STring :" + ArrayStr[element] + "  equal :" + ArrayInt[element]);
//		this.element++;
//	}



	public void display() {

		System.out.print("Display this array. \n");
		for (int i = 0; i < element + 1; i++) {
			System.out.print(ArrayStr[i] + " is: " + ArrayInt[i] + "\n");
		}
	}

	public int getInt(String x) {

		for (int i = 0; i < totalEle; i++) {
			if (ArrayStr[i] == x) {
				return ArrayInt[i];
			}
		}
		return -1;

	}

	public int getInt2(String x) {
		System.out.println("x="+x);
		System.out.println("A="+ArrayInt[0]);
		System.out.println("B="+ArrayInt[1]);
		System.out.println(ArrayInt[0]+ArrayInt[1]);
//		for (int i = 0; i < totalEle; i++) {
//			if (ArrayStr[i] == x) {
//				return ArrayInt[i];
//				// break;
//			}
//		}
		if (x == "A")
		{
			return ArrayInt[0];
		}
		else
		{
			return ArrayInt[1];
		}
		//return -1;

	}
}