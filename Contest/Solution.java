package Contest;

import java.io.*;
import java.util.*;

public class Solution {
	
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    	int t = sc.nextInt();
    	
    	for(int i=0; i<t; i++) {
    		int ini = sc.nextInt();
    		int la=  sc.nextInt();
    		
//    		process(ini ,la);
    		
    	}
    }
    static ArrayList<Integer> ram = new ArrayList<Integer>();
	static ArrayList<Integer> seema = new ArrayList<Integer>();

	private static void processRam(int ini, int la) {
		
		for(int i=1; i<=la; i+=2) {
			if(isIlligible(i,ini,la)) {
				ram.add(i);
			}
		}
		
		for(int i=2; i<=la; i+=2) {
			if(isIlligible(i,ini,la)) {
				seema.add(i);
			}
		}
		
	
	}

	private static boolean isIlligible(int a,int ini,int la) {
		
		while(a<=la) {
			if(a>=ini && a<=la) {
				return true;
			}
			a += a;
		}
		
		return false;
	}

	
}

