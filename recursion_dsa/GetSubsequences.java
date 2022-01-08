package recursion_dsa;

import java.util.Scanner;
import java.util.ArrayList;

public class GetSubsequences {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		
		System.out.println(subsequences(str));
		
		str="ab";
		System.out.println(subsequencesWithASCII(str));
		
	}
	
	public static ArrayList<String> subsequences(String str){
		
		if(str.length()==0) {
			ArrayList<String> rr=new ArrayList<>();
		    rr.add("");
			return rr;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> mr=new ArrayList<>();
		ArrayList<String> rr=subsequences(ros);
		
		for(int i=0; i<rr.size(); i++) {
			mr.add(rr.get(i));
		}
		
		for(int i=0; i<rr.size(); i++) {
			mr.add(ch+rr.get(i));
		}
		
		return  mr;
	}
	
	public static ArrayList<String> subsequencesWithASCII(String str){
		
		if(str.length()==0) {
			ArrayList<String> rr=new ArrayList<>();
			rr.add("");
			return rr;
		}
		
		char ch=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> mr=new ArrayList<>();
		ArrayList<String> rr=subsequencesWithASCII(ros);
		
		for(int i=0; i<rr.size(); i++) {
			mr.add(rr.get(i));
		}
		
		for(int i=0; i<rr.size(); i++) {
			mr.add(ch+rr.get(i));
		}
		
		for(int i=0; i<rr.size(); i++) {
			String k=(int) ch+"";
			mr.add(k+rr.get(i));
		}
		
		return mr;
	}

	
}
