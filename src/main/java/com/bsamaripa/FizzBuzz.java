package com.bsamaripa;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public String FizzBuzz(int num) {
        if (num <= 1) {
            System.out.println(String.format("%s", num));
            System.out.println("fizz: 0\nbuzz: 0\nfizzbuzz: 0\nlucky: 0\ninteger: 1");
            return String.format("%s", num);
        }

        List<String> res = IntStream.rangeClosed(1, num)
            .mapToObj(i -> checkFizzBuzz(i)).collect(Collectors.toList());

        Map<String, Long> counts = res.stream().map(i -> {
            if (isInteger(i)) return "integer";
            return i;
        }).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        String formattedCounts = formatCounts(counts);

        System.out.println(String.join(" ", res));
        System.out.println(formattedCounts);

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
        return String.valueOf(num).contains("3");
    }

    boolean isInteger(String num) {
        try {
            Integer.parseInt(num);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }

    String formatCounts(Map<String, Long> counts) {
        return String.format("fizz: %s\nbuzz: %s\nfizzbuzz: %s\nlucky: %s\ninteger: %s",
                counts.getOrDefault("fizz", 0L),
                counts.getOrDefault("buzz", 0L),
                counts.getOrDefault("fizzbuzz", 0L),
                counts.getOrDefault("lucky", 0L),
                counts.getOrDefault("integer", 0L)
        );
    }
}


