package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


    // Test 1: Asserting that only brackets return true
    @Test
    public void onlyBracketsReturnsTrue() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("[]");
        assertTrue(condition);
    }

    // Test 2: Asserting that balanced brackets in a string returns true
    @Test
    public void bracketsInAStringReturnsTrue() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("[Example string]");
        assertTrue(condition);
    }

    // Test 3: Asserting that unbalanced brackets return false
    @Test
    public void unbalancedBracketsReturnFalse() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("[Example string[");
        assertFalse(condition);
    }

    // Test 4: Asserting that one single bracket returns false
    @Test
    public void singleBracketReturnsFalse() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("]");
        assertFalse(condition);
    }

    // Test 5: Asserting that an empty string will return false
    @Test
    public void emptyString() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("");
        assertFalse(condition);
    }

    // Test 6: Asserting that a number would throw an error
//    @Test
//    public void isANumber() {
//        assertThrows(IllegalArgumentException.class, () -> BalancedBrackets.hasBalancedBrackets("5"), "String must include letters, not numbers.");
//    }

    // Test 7: Asserting that uneven numbers of brackets would return false
    @Test
    public void unevenNumBrackets() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("Example] [String]");
        assertFalse(condition);
    }

    // Test 8: Asserting that curly brackets do not count
    @Test
    public void curlyBracketsTest() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("Example} [String]");
        assertFalse(condition);
    }

    // Test 9: Asserting that order doesn't matter
    @Test
    public void bracketOrderTest() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("[[[]Example]] String[]");
        assertTrue(condition);
    }

    // Test 10: Asserting that reversed brackets return true
    @Test
    public void reverseBracketTest() {
        boolean condition = BalancedBrackets.hasBalancedBrackets("][");
        assertFalse(condition);
    }



}