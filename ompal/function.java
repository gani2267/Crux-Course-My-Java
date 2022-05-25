package ompal;

public class function {
    public static void main(String[] args) {

        // 3,4 inko add karke print karna he function se
        add1();
        add2(5,6);
        System.out.println(add3());
        int v = add3();
        System.out.println(add4(7,32));

    }

    // no arguments, no return type
    static void add1(){
        System.out.println(3+4);
    }

    // has arguments , no return type
    static void add2(int a, int b){
        System.out.println(a+b);
    }

    // no arguments , has return type
    static int add3(){
        return 3+4;
    }

    // has arguments , has return type
    static int add4(int a, int b){
        return a+b;
    }


}
