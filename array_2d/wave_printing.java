package array_2d;

public class wave_printing {

	public static void main(String[] args) {
		
		int[][] arr= {
				{1,3,4,5},
				{2,4},
				{21,33,42},
				{2,3,5,5,4,3,2}
		};
		
		WavePrint(arr);
		
	}
	
	public static void WavePrint(int[][] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				forwardprint(arr[i]);
			}else {
				backwardprint(arr[i]);
			}
			System.out.println();
		}
	}

	public static void forwardprint(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
    public static void backwardprint(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+"\t");
		}
	}
	
}
