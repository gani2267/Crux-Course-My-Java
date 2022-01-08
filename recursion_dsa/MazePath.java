package recursion_dsa;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MazePath(0,0,2,2));
	}
	
	public static ArrayList<String> MazePath(int starti,int startj,int endi,int endj){
		
		if(starti==endi && startj==endj) {
			ArrayList<String> rr=new ArrayList<>();
			rr.add("");
			return rr;
		}
		
		if(starti>endi || startj>endj) {
			ArrayList<String> rr=new ArrayList<>();
			return rr;
		}
		
		ArrayList<String> mr=new ArrayList<>();
		
		
		ArrayList<String> rrj=new ArrayList<>();
	    rrj=MazePath(starti,startj+1,endi,endj);
	    
	    for(String rrs : rrj) {
			   mr.add("H"+rrs);
			}
			
			
	    ArrayList<String> rri=new ArrayList<>();
		rri=MazePath(starti+1,startj,endi,endj);
			
		for(String rrs : rri) {
		   mr.add("V"+rrs);
		}
			
		
		
		return mr;
	}

}