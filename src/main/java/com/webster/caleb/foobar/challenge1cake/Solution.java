package com.webster.caleb.foobar.challenge1cake;

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(solution("abcabababababcabababab"));
    }
    
    public static int solution(String x) {
        return getMaxPieces(x, 1);
    }
    
    /*
    Returns the maximum number of equal pieces of a certain length that a string
    can be divided into.
     */
    public static int getMaxPieces(String x, int sliceSize) {
        if (sliceSize < 1 || sliceSize > x.length()) {
            throw new IllegalArgumentException("Slice size must be between 1 and string length.");
        }
        if (x.length() % sliceSize == 0 && substringRepeats(x, x.substring(0, sliceSize), 0)) {
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
    Returns true if a given string is comprised of repetitions of a substring
    which starts at i and has a certain length.
     */
//    public static boolean substringRepeats(String string, int subLength, int subStart) {
//        int ii = subStart+subLength;
//        if (subStart == string.length()) {
//            return true;
//        } else if (string.substring(subStart, ii).equals(string.substring(0, subLength))) {
//            return substringRepeats(string, subLength, ii);
//        }
//        return false;
//    }
    
    /*
    Returns true if a given string is comprised of repetitions of a substring
    which starts at i and has a certain length. 0123456789
     */
    public static boolean substringRepeats(String string, String substring, int checkIndex) {
        if (checkIndex == string.length()) {
            return true;
        } else if (string.substring(checkIndex, checkIndex+substring.length()).equals(substring)) {
            return substringRepeats(string, substring, checkIndex+substring.length());
        }
        return false;
    }
    
}
