package recursion_dsa;

public class PrintSubSequences {

	public static void main(String[] args) {
		
		System.out.print("[ ");
		PrintSS("abc","");
		System.out.print("]");
		
		System.out.print("\n[ ");
		PrintSSWithASCII("ab","");
		System.out.print("]");

	}
	
	public static void PrintSS(String str,String result) {
		
		if(str.length()<=0) {
			System.out.print(result+" ");
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		PrintSS(ros,result);
		PrintSS(ros,result+ch);
	}
	
	public static void PrintSSWithASCII(String str,String result) {
		if(str.length()==0) {
			System.out.print(result+" ");
			return;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		PrintSSWithASCII(ros,result);
		PrintSSWithASCII(ros,result+ch);
		
		String s=(int)ch+"";
		PrintSSWithASCII(ros,result+s);
		
		
	}

}
