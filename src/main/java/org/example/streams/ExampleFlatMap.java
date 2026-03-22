package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFlatMap {

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        //flatten the list

        List<Integer> flattenedList = listOfLists.stream().flatMap(l -> l.stream()).map(e -> e * e).collect(Collectors.toList());
        System.out.println(flattenedList);


        // List of Strings where each string is sentence and print all words

        List<String> sentences = Arrays.asList(
                "Java is fun",
                "FlatMap is powerful"
        );
        List<String> words = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).collect(Collectors.toList());
        System.out.println(words);
    }
}
