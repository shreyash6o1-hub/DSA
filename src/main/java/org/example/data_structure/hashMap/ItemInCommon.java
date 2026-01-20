package org.example.data_structure.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ItemInCommon {

    public static boolean itemInCommon(int[]arr1, int[] arr2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr1.length; i++)
        {
            map.put(arr1[i],i);
        }
        for(int i=0;i<arr2.length ;i++)
        {
            if(map.containsKey(arr2[i]))
            {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("These tests confirm itemInCommon() detects");
        System.out.println("whether two arrays share any common element.");
        System.out.println();

        // Test 1: Common element exists
        System.out.println("Test 1: Common Element Exists");
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 3};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array1, array2));
        System.out.println();

        // Test 2: No common element
        System.out.println("Test 2: No Common Element");
        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};
        System.out.println("Expected: false");
        System.out.println("Actual: " + itemInCommon(array3, array4));
        System.out.println();

        // Test 3: All elements match
        System.out.println("Test 3: All Elements Match");
        int[] array5 = {7, 8, 9};
        int[] array6 = {7, 8, 9};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array5, array6));
        System.out.println();

        // Test 4: Arrays with duplicates
        System.out.println("Test 4: Arrays with Duplicates");
        int[] array7 = {1, 1, 2, 3};
        int[] array8 = {3, 3, 4, 5};
        System.out.println("Expected: true");
        System.out.println("Actual: " + itemInCommon(array7, array8));
        System.out.println();

        // Test 5: Edge case with empty array
        System.out.println("Test 5: Edge Case with Empty Array");
        int[] array9 = {};
        int[] array10 = {1, 2, 3};
        System.out.println("Expected: false");
        System.out.println("Actual: " + itemInCommon(array9, array10));
        System.out.println();

        /*
            EXPECTED OUTPUT:
            ----------------
            These tests confirm itemInCommon() detects
            whether two arrays share any common element.

            Test 1: Common Element Exists
            Expected: true
            Actual: true

            Test 2: No Common Element
            Expected: false
            Actual: false

            Test 3: All Elements Match
            Expected: true
            Actual: true

            Test 4: Arrays with Duplicates
            Expected: true
            Actual: true

            Test 5: Edge Case with Empty Array
            Expected: false
            Actual: false
        */

    }
}
