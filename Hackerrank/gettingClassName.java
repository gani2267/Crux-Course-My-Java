package Hackerrank;

import java.io.*;
import java.util.*;

class animal{
	
}

class bird extends animal{
	
}

public class gettingClassName {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
    	animal a=new animal();
    	System.out.println(a.getClass().getName());
    	
    	bird b=new bird();
    	System.out.println(b.getClass().getName());   
    	
    	System.out.println(b.getClass().getSuperclass().getName());
    	
    }
}
