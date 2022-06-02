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
    public static int getMaxPieces(String x) {
        return getMaxPieces(x, 1);
    }
    
    /*
    Returns the max number of equal substrings of a certain length that a string
    can be divided into.
     */
    private static int getMaxPieces(String x, int sliceSize) {
        if (sliceSize < 1 || sliceSize > x.length()) {
            return 0;
        }
        if (x.length() % sliceSize == 0 && isRepeatedSubstring(x, x.substring(0, sliceSize), 0)) {
            return x.length() / sliceSize;
        } else {
            return getMaxPieces(x, sliceSize+1);
        }
    }

//    public static int getMaxPieces(String x, int numPieces) {
//        System.out.println(numPieces);
//        int pieceSize = x.length() / numPieces;
//        if (numPieces == 1 || seqRepeats(0, pieceSize, x))
//            return numPieces;
//        return getMaxPieces(x, numPieces / 2);
//    }
    
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
