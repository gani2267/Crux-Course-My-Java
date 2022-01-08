package array_2d;

public class Spiral_print {
	
	public static void main(String[] args) {
		
		int[][] arr= {
				{3,5,6,4},
				{1,4,6,6},
				{13,2,5,5},
				{2,4,6,66}
		};
		
		int row=arr.length-1;
		int col=arr[0].length-1;
		int rs=0; int cs=0;
		
		SpiralPrint(arr,row,col,rs,cs);
		
		
	}
	
	public static void SpiralPrint(int[][] arr,int row,int col,int rs,int cs) {
		
		ltr(arr,rs,cs,col);
		utd(arr,col,(rs+1),row);
		rtl(arr,row,(col-1),cs);
		dtu(arr,cs,(row-1),(rs+1));
		
		row--;col--;rs++;cs++;
		
		
		if(rs<row && cs<col) {
		SpiralPrint(arr,row,col,rs,cs);
		}
	}
	
	public static void ltr(int[][] arr, int a, int b,int c) {
		for(int i=b; i<=c; i++) {
			System.out.print(arr[a][i]+" ");
		}
	}
    public static void utd(int[][] arr,int a,int b,int c) {
        for(int i=b; i<=c; i++) {
        	System.out.print(arr[i][a]+" ");
		}
	}
    public static void rtl(int[][] arr,int a,int b,int c) {
        for(int i=b; i>=c; i--) {
        	System.out.print(arr[a][i]+" ");
		}
		
	}
     public static void dtu(int[][] arr,int a,int b,int c) {
    	for(int i=b; i>=c; i--) {
    		System.out.print(arr[i][a]+" ");
 		}
    }
}
