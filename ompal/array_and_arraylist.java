package ompal;

import java.util.ArrayList;

public class array_and_arraylist {

    public static void main(String[] args) {

        // array ka size fixed hot he
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr);
        arr[0] = 33;
        System.out.println(arr.length);

        // arraylist ka badhta he size
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        al.set(0,33);
        System.out.println(al.size());

        // String
        String str = "I am ompal";
        System.out.println(str.length());
        System.out.println(str.charAt(3));
        System.out.println("I am " + " ompal ");
    }
}
