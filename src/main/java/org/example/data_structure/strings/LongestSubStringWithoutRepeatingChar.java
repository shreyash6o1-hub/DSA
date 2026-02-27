package org.example.data_structure.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

    static int longestSubstring(String input)
    {
        Map<Character, Integer> charMap = new HashMap<>();
        int l = 0;
        int r = 0;
        int len ;
        int maxLen = 0;
        while(r<input.length())
        {
            if(charMap.containsKey(input.charAt(r)) && charMap.get(input.charAt(r))> l)
            {
                l= charMap.get(input.charAt(r))+1;
                charMap.put(input.charAt(r),r);
            }
            charMap.put(input.charAt(r),r);
            System.out.println(charMap);
            maxLen = Math.max(r-l +1, maxLen);
            System.out.println(maxLen);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("cadbvpzabcd"));
    }
}
