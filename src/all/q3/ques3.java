package all.q3;

import java.util.ArrayList;
import java.util.Collections;

public class ques3 { public static void main(String[] args) {
    ArrayList<Integer> arr= new ArrayList<>();
    arr.add(10);
    arr.add(1);
    arr.add(12);
    arr.add(13);
    arr.add(9);
    arr.add(11);
    arr.add(18);
    arr.add(16);
    Collections.sort(arr);
    System.out.println(arr);
    System.out.println("1st num:");
    System.out.println(arr.get(0));
    System.out.println("2nd num:");
    System.out.println(arr.get(1)); }
}

