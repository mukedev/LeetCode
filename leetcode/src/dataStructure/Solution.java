package dataStructure;

//
public class Solution {
	public static void main(String[] args) {
		System.out.println(reversalNum(123));
	}

	public static int reversalNum(int num) {
		boolean bool = false;
		char numStr = (num + "").charAt(0);
		if (numStr == '-') {
			num = -num;
			bool = true;
		}
		num = Integer.parseInt(new StringBuffer(num + "").reverse().toString());
		if (bool) {
			num = -num;
		}

		return num;
	}
}
