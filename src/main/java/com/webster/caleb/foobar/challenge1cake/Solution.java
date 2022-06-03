package com.webster.caleb.foobar.challenge1cake;

public class Solution {
    
    public static int solution(String x) {
        return getMaxPieces(x);
    }
    
    /*
    Returns the max number of equal pieces that a string can be divided into.
    This method serves as an abstraction for the private recursive method which
    shares its name. It calls this private method with sliceSize set to 1.
     */
    public static int getMaxPieces(String string) {
        return getMaxPieces(string, 1);
    }
    
    /*
    Returns the max number of equal substrings of a certain length that a string
    can be divided into.
     */
    private static int getMaxPieces(String string, int sliceSize) {
        if (isRepeatedSubstring(string, string.substring(0, sliceSize))) {
            return string.length() / sliceSize;
        } else {
            return getMaxPieces(string, sliceSize+1);
        }
    }
    
    /*
    Returns true if a given string is comprised of repetitions of a substring.
    This method serves as an abstraction for the private recursive method which
    shares its name. It calls this private method with checkIndex set to 0.
     */
    public static boolean isRepeatedSubstring(String string, String substring) {
        return isRepeatedSubstring(string, substring, 0);
    }
    
    /*
    Returns true if a given string is comprised of repetitions of a substring
    from checkIndex onwards.
    checkIndex must be 0 or a multiple of substring length, but must be < string
    length.
     */
    private static boolean isRepeatedSubstring(String string, String substring, int checkIndex) {
        if (string.length() == 0 || substring.length() == 0 || string.length() % substring.length() != 0) {return false;}
        if (checkIndex == string.length()) {
            return true;
        } else if (string.substring(checkIndex, checkIndex+substring.length()).equals(substring)) {
            return isRepeatedSubstring(string, substring, checkIndex+substring.length());
        }
        return false;
    }
}
