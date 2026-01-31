package org.example.data_structure.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static boolean removeDuplicates(String input){
        Set<Character> charSet = new HashSet<>();

        for(int i = 0 ;i < input.length(); i++)
        {
            if(charSet.contains(input.charAt(i)))
            {return false;
            }
            else{
                charSet.add(input.charAt(i));
            }
        }return true;

    }
}
