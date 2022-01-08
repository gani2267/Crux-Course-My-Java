package Arrays;

public class Min_and_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,8,33,32,5,66,3,5,4,2,0};
		
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		System.out.println("Max number in arr : "+max);
		System.out.println("Min number in arr ; "+min);

	}

}
