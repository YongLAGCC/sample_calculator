
//david 


package Calculator;


public class s3 {

	private char[] name;
	private int[] value;
	private int size;
	private int index = 0;

	// --------------------------------------------------------------
	public s3(int s) {
		this.size = s;
		name = new char[size];
		value = new int[size];
	}

	public void add(char key, int number) {
		for (int i = 0; i < size; i++) {
			if (name[i] == key) 
			{
				value[i] = number;
				break;
			} else { 
				name[index] = key;
				value[index] = number;
				this.index++;
				break;
			}
		}
	}

	public void getChar(int y) { 
		for (int j = 0; j < size; j++) 
		{
			if (value[j] == y)
				System.out.print(name[j] + " ");
		}

	}

	public int getInt(char x) { 
		for (int j = 0; j < size; j++) 
		{
			if (name[j] == x) {
			System.out.println("the values is :"+value[j]);
				return value[j];
			}
		}
		return -1;

	}


}
