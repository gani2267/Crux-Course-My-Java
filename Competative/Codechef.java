package Competative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

class Codechef {
    //    static Scanner sc = new Scanner(System.in);
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static FastReader fr = new FastReader();
    static myPrinter<Integer> mp = new myPrinter<Integer>();

    public static void main(String[] args) throws IOException {
//        int t = Integer.parseInt(bf.readLine());
        int t = fr.nextInt();

//        while (t > 0){t--;
//
//        }

        student[] arr = new student[t];

        for(int i=0; i<t; i++){
            student s = new student();
            s.name = fr.next();
            s.eng = fr.nextInt();
            s.math = fr.nextInt();
            s.mpmc = fr.nextInt();
            s.total();
            arr[i] = s;
        }

        Arrays.sort(arr,new cmp());
        for(int i=0; i<t; i++){
            System.out.println(arr[i].name);
        }


    }

    private static int[] giveArr(int n) {
        int [] arr = new int[n];

        int j = 1;
        int k = 2;
        for(int i=0; i<n; i++){
            if((i) % 20 == 0){
                j+=k;
                k++;
            }
            arr[i] = j<<(i%22);
        }
        return arr;
    }


    static class myPrinter<T> {

        public void printArr(T[] arr){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public void printList(ArrayList<T> al){
            for(int i=0; i<al.size(); i++){
                System.out.print(al.get(i)+" ");
            }
            System.out.println();
        }

        public void printIntArr(int[] arr){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        public List<Integer> nextList() throws IOException {
            return Stream.of(br.readLine().replaceAll("\\s+$","").split(" "))
                    .map(Integer::parseInt).collect(toList());
        }

        public int[] nextArr()throws IOException{
            List<Integer> list = Stream.of(br.readLine().replaceAll("\\s+$","").split(" "))
                    .map(Integer::parseInt).collect(toList());
            return list.stream().mapToInt(Integer::intValue).toArray();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}