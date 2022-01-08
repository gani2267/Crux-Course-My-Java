package recursion_dsa;

public class printPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintPermutation("abc","");
	}
	
	public static void PrintPermutation(String str,String result) {
		
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			String ros= str.substring(0,i)+str.substring(i+1);
		    PrintPermutation(ros,result+ch);
		}
		
	}
}
