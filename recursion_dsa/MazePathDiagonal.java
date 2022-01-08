package recursion_dsa;

import java.util.ArrayList;

public class MazePathDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MazePathDiag(0,0,2,2));
	}
	
	public static ArrayList<String> MazePathDiag(int starti,int startj,int endi,int endj){
		
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
		
		ArrayList<String> rri=MazePathDiag(starti+1,startj,endi,endj);
		for(String rrs : rri) {
			mr.add("H"+rrs);
		}
		
		ArrayList<String> rrj=MazePathDiag(starti,startj+1,endi,endj);
		for(String rrs : rrj) {
			mr.add("V"+rrs);
		}
		
		ArrayList<String> rrd=MazePathDiag(starti+1,startj+1,endi,endj);
		for(String rrs : rrd) {
			mr.add("D"+rrs);
		}
		
		return mr;
	}

}
