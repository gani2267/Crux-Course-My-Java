package oops.inheritance;

import oops.StackUsingArray;

public class ReverseStack {

	public static void main(String[] args) throws Exception {

		StackUsingArray stack = new StackUsingArray(5);

		for (int i = 1; i <= 5; i++) {
			stack.push(i * 10);
		}
		stack.display();

		StackUsingArray helper = new StackUsingArray(5);
		ReverseStack(stack, helper, 0);
		stack.display();

	}

	public static void ReverseStack(StackUsingArray a, StackUsingArray b, int i) throws Exception {

		if (a.isEmpty()) {            //
			return;                   //
		}                             //

		int item = a.pop();           //
		ReverseStack(a, b, i + 1);    //
		b.push(item);           // these all '//' lines are written for just doing " b=a;"

		if (i == 0) {
			while (!b.isEmpty()) {
				int value = b.pop();
				a.push(value);
			}
		}

	}

}
