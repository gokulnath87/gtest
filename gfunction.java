package consumer;

import java.util.function.Function;

public class gfunction {
    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();

        Integer apply = func.apply("gokul");

        System.out.println(apply);

    }

}

