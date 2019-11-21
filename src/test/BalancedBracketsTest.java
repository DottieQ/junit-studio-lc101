package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    BalancedBrackets test_Class;

    @Before
    public void createBalancedBracketsObject() {
        test_Class = new BalancedBrackets();
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
  //      BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void leftBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    @Test
    public void rightBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void textInsideBracketsReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textWithBracketsInsideReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void textWithBracketsAtEndReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void textWithBracketsAtBeginningReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_Class.hasBalancedBrackets(""));
    }

    @Test
    public void textWithOneBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void rightThenLeftBracketsReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    @Test
    public void textWithRightThenLeftBracketReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void threeBracketsReturnsFalse() {
        assertFalse(test_Class.hasBalancedBrackets("[[]"));
    }

}
