package com.ten10.programming;

import static org.junit.Assert.*;
import org.junit.Test;

public class ProgrammingTest {
   @Test
  public void runTests() {
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {1,4,1,4,2,1,3,5,6,2,3,7}), 4);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {3,1,4,1,5,9,2,6,5,3,5}), 3);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {2,7,1,8,2,8,1}), 2);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {2}), 1);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {2,3,4}), 3);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {-22,3,4}), 3);
      assertEquals(Programming.getLongestOrderedSubsequence(new int[] {}), 1);
   }
}
