package com.bsamaripa;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String FizzBuzz(int num) {
        if (num <= 1) {
            System.out.println(String.format("%s", num));
            return String.format("%s", num);
        }

        List<String> res = IntStream.rangeClosed(1, num)
            .mapToObj(i -> checkFizzBuzz(i)).collect(Collectors.toList());

        System.out.println(String.join(" ", res));
        return String.join(" ", res);
    }

    String checkFizzBuzz(int num) {
        if (num <= 0) return String.format("%s", num);
        else if (containsThree(num)) return "lucky";
        else if (num % 15 == 0 ) return "fizzbuzz";
        else if (divBy(num, 5)) return "buzz";
        else if (divBy(num, 3)) return "fizz";
        else return String.format("%s", num);
    }

    boolean divBy(int num, int div) {
        return num % div == 0;
    }

    boolean containsThree(int num) {
        String str = String.valueOf(num);
        if (str.contains("3")) return true;
        return false;
    }
}


