package CB_DSA_Practice;

import java.util.Scanner;

public class MappedString {
	
	static char[] alphabet = new char[27];

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = sc.next();
		int j = 1;

		for (char i = 'A'; i <= 'Z'; i++) {
			alphabet[j] = i;
			j++;
		}

		char[] ch = new char[str.length()];

		mappedString(str, 0, ch, 0);
	}
	
	public static void mappedString(String str, int i, char[] ch, int j) {

		if (i >= str.length()) {
			String s = String.valueOf(ch, 0, j);
//			String s=String.copyValueOf(ch, 0, j);             //This is also valid
			System.out.println(s);
			return;
		}

		int a = (int) str.charAt(i);
		ch[j] = alphabet[a - 48];
		mappedString(str, i + 1, ch, j + 1);

		if ((i + 1) != str.length()) {
			int b = Integer.valueOf(str.substring(i, i + 2));
			if (b > 9 && b < 27) {
				ch[j] = alphabet[b];
				mappedString(str, i + 2, ch, j + 1);
			}
		}
	}

}
