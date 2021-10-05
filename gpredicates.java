package consumer;

import java.util.function.Predicate;

public class gpredicates {

    public static void main(String[] args)
    {
        // Creating predicate
        Predicate<Integer> lesserThan = i -> (i < 18);

        // Calling Predicate method
        System.out.println(lesserThan.test(10));
    }
}

