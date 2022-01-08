package recursion_dsa;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		
		System.out.println(permutation(str));
	}
	
	public static ArrayList<String> permutation(String str){
		
		if(str.length()==0) {
			ArrayList<String> y=new ArrayList<>();
			y.add("");
			return y;
		}
		
		String ros=str.substring(1);                  //rest of string == ros
		char ch=str.charAt(0);
		
		ArrayList<String> rr=permutation(ros);       //real result == rr 
		ArrayList<String> mr=new ArrayList<>();      //my result == mr
		
		for(String s: rr) {
			
			for(int j=0; j<= s.length(); j++) {
				
				String s3=s.substring(0,j)+ch+s.substring(j);
				mr.add(s3);
			}
		}
		
		return mr;
	}

}
