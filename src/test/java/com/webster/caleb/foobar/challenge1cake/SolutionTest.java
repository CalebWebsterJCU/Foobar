package com.webster.caleb.foobar.challenge1cake;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    
    @Test
    void repeatedSubstringWorks() {
        assertFalse(Solution.isRepeatedSubstring("", "a"));
        assertFalse(Solution.isRepeatedSubstring("1", ""));
        assertTrue(Solution.isRepeatedSubstring("a", "a"));
        assertFalse(Solution.isRepeatedSubstring("ab", "a"));
        assertFalse(Solution.isRepeatedSubstring("ab", "abab"));
        assertFalse(Solution.isRepeatedSubstring("abc", "ab"));
        assertTrue(Solution.isRepeatedSubstring("abc", "abc"));
        assertFalse(Solution.isRepeatedSubstring("a-b-c", "a-"));
        assertTrue(Solution.isRepeatedSubstring("~!@# ~!@# ~!@# ", "~!@# "));
        assertFalse(Solution.isRepeatedSubstring("     l", " l"));
        assertTrue(Solution.isRepeatedSubstring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a"));
    }
    
    @Test
    void getMaxPiecesWorks() {
        assertEquals(1, Solution.getMaxPieces("0123456789"));
        assertEquals(1, Solution.getMaxPieces("123456789"));
        assertEquals(1, Solution.getMaxPieces("01234567891011121314151617012345678910111213141516170123456789101112131415161701234567891011121314151617012345678910111213141516171819202122232425262728293018192021222324252627282930181920212223242526272829301819202122232425262728293018192021222324252627282930"));
        assertEquals(0, Solution.getMaxPieces(""));
        assertEquals(1, Solution.getMaxPieces("a"));
        assertEquals(1, Solution.getMaxPieces("ab"));
        assertEquals(1, Solution.getMaxPieces("aba"));
        assertEquals(2, Solution.getMaxPieces("abab"));
        assertEquals(3, Solution.getMaxPieces("ababab"));
        assertEquals(6, Solution.getMaxPieces("aaaaaa"));
        assertEquals(6, Solution.getMaxPieces("      "));
        assertEquals(3, Solution.getMaxPieces("\n\n \n\n \n\n "));
        assertEquals(6, Solution.getMaxPieces("\\\\\\\\\\\\"));
    }
}