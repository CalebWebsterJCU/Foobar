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
        assertFalse(Solution.isRepeatedSubstring("abc", "ab"));
        assertTrue(Solution.isRepeatedSubstring("abc", "abc"));
        assertFalse(Solution.isRepeatedSubstring("a-b-c", "a-"));
    }
}