package org.example.data_structure.hashMap;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[]input)
    {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : input){
            char []  charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = Arrays.toString(charArray);
            if(map.containsKey(sortedKey))
            {
                map.get(sortedKey).add(s);
            }else
            {
                List<String> ls = new ArrayList<>();
                ls.add(s);
                map.put(sortedKey,ls);
            }
        }
        List<List<String>>output = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet())
        {
            output.add(entry.getValue());
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println("These tests confirm groupAnagrams() groups");
        System.out.println("words by sorted characters, including handling");
        System.out.println("duplicates, empty strings, and multiple groups.");
        System.out.println();

        // Test 1: Single group of anagrams
        System.out.println("Test 1: Single Group");
        String[] input1 = {"bat", "tab"};
        System.out.println("Expected: [[bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input1));
        System.out.println();

        // Test 2: Words with no anagrams
        System.out.println("Test 2: Single Words Remain");
        String[] input2 = {"dog", "cat"};
        System.out.println("Expected: [[dog], [cat]] (order may vary)");
        System.out.println("Actual: " + groupAnagrams(input2));
        System.out.println();

        // Test 3: Multiple groups
        System.out.println("Test 3: Multiple Groups");
        String[] input3 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Expected: [[eat, tea, ate], [tan, nat], [bat]]");
        System.out.println("Actual: " + groupAnagrams(input3));
        System.out.println();

        // Test 4: Duplicate words
        System.out.println("Test 4: Duplicate Words");
        String[] input4 = {"bat", "tab", "bat"};
        System.out.println("Expected: [[bat, bat, tab]]");
        System.out.println("Actual: " + groupAnagrams(input4));
        System.out.println();

        // Test 5: Edge cases (empty strings and empty input)
        System.out.println("Test 5: Edge Cases");
        String[] input5 = {"", ""};
        String[] input6 = {};
        System.out.println("Expected (empty strings): [[, ]]");
        System.out.println("Actual: " + groupAnagrams(input5));
        System.out.println("Expected (empty input): []");
        System.out.println("Actual: " + groupAnagrams(input6));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm groupAnagrams() groups
            words by sorted characters, including handling
            duplicates, empty strings, and multiple groups.

            Test 1: Single Group
            Expected: [[bat, tab]]
            Actual: [[bat, tab]]

            Test 2: Single Words Remain
            Expected: [[dog], [cat]] (order may vary)
            Actual: [[dog], [cat]]

            Test 3: Multiple Groups
            Expected: [[eat, tea, ate], [tan, nat], [bat]]
            Actual: [[eat, tea, ate], [tan, nat], [bat]]

            Test 4: Duplicate Words
            Expected: [[bat, bat, tab]]
            Actual: [[bat, bat, tab]]

            Test 5: Edge Cases
            Expected (empty strings): [[, ]]
            Actual: [[, ]]
            Expected (empty input): []
            Actual: []
        */

    }

}
