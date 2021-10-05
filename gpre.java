package gpack;

import java.util.Scanner;
import java.util.function.Predicate;

public class gpre {
    public static void main(String[] args) {
        Predicate<Integer> g = (x) -> x > 0;
        System.out.println("enter no");
        Scanner sc = new Scanner(System.in);
        System.out.println(g.test(sc.nextInt())) ;
    }
}
