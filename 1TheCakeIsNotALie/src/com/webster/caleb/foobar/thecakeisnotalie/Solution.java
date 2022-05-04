package com.webster.caleb.foobar.thecakeisnotalie;

public class Solution {
    
    public static int solution(String x) {
        return getMaxPieces(x, 1);
    }
    
    public static int getMaxPieces(String x, int sliceSize) {
        if (sliceSize < 1 || sliceSize > x.length()) {
            throw new IllegalArgumentException("Slice size must be between 1 and string length.");
        }
        if (x.length() % sliceSize == 0 && seqRepeats(x, sliceSize, 0)) {
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
    
    public static boolean seqRepeats(String x, int len, int i) {
        int ii = i+len;
        if (i == x.length()) {
            return true;
        } else if (x.substring(i, ii).equals(x.substring(0, len))) {
            return seqRepeats(x, len, ii);
        }
        return false;
    }
    
}
