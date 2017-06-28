package com.ten10.programming;


public class Programming {
   public static int getLongestOrderedSubsequence(int[] array) {
      int longest = 1, count = 1;
      for(int i=1; i<array.length; i++) {
         count = array[i] > array[i-1] ? count+1 : 1;
         if(count > longest)
            longest = count;
      }
      return longest;
   }
}
