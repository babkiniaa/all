package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        String si = " -importkeystore true -srckeystore kafka.jks -destkeystore kafka.p12  -deststoretype PKCS12";

        Map<String, String> paramMap = Arrays.stream(si.split("\s+-"))
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toMap(s -> "-" + s.split("\s+")[0], s -> s.split("\s+")[1]));
        System.out.println(paramMap);

        // 2 Задние
        String res = paramMap.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .collect(Collectors.joining(" "));
        System.out.println(res);

        // 3 Задание
        System.out.println();
        IntStream.range(1, 10).forEach(i->{
            IntStream.range(1, 10).forEach(j-> System.out.println(i + " * " + j + " = " + i * j));
        });

    }
}
