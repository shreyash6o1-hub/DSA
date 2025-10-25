package org.example;

public class All_SubSequences_Of_String {

    static void subsequences(String str, int i, String curr){

        if(i==str.length())
        {
            System.out.println(curr);
            return;
        }

        subsequences(str,i+1,curr + str.charAt(i));
        subsequences(str,i+1,curr);

    }

    public static void main(String[] args)
    {
        String str = "abc";
        subsequences(str,0,"");
    }
}
