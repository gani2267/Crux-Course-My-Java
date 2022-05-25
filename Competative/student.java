package Competative;

import oops.Student;

import java.util.Comparator;

public class student {
    String name;
    int math;
    int eng;
    int mpmc;

    int total;

    public int total(){
        this.total = math + eng + mpmc;
        return total;
    }

}

class cmp implements Comparator<student> {

    @Override
    public int compare(student t, student t1) {
        return t1.total-t.total;
    }
}


