package ompal;

import oops.inheritance.P;

public class conditionals {

    public static void main(String[] args) {

        // 2 types of conditions
        // 1 if-else
        // switch

        boolean bool ;

        System.out.println(345);

        int a = 3;
        if(a % 2 ==0 ) {
            System.out.println("a is even");
        }else {
            System.out.println("a is odd");
        }

        switch (a){
            case 1:
                System.out.println("a is one");
                break;
            case  2:
                System.out.println("a is two");
                break;
            case 3:
                System.out.println("a is three");
                break;
            default:
                System.out.println("a is different");
        }
    }
}
