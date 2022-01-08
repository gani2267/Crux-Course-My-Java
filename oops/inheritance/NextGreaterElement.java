package oops.inheritance;

//import oops.StackUsingArray;

public class NextGreaterElement {

	public static void main(String[] args) throws Exception {
		
		int[] arr= {2,1,3,8,6,7,5};
		
		DyanamicStack stack=new DyanamicStack(arr.length);
		
		
		for(int i=0; i<arr.length; i++) {
			
			while(!stack.isEmpty()  &&  arr[i]>stack.top()){
				
				int r=stack.pop();
				System.out.println(r +"->"+arr[i]);
			}
			
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			int r=stack.pop();
			System.out.println(r +"->"+"-1");
		}

	}

}
