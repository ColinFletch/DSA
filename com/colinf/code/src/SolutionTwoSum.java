package com.colinf.code.src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SolutionTwoSum {

    public int[] twoSumSorted(int[] nums, int target) {
        // use two pointers 
        nums = sort(nums);
        int pointerOne = 0;
        int pointerTwo = nums.length -1 ; 

        // traverse based on sum vs target;
        // return the location of 
        while (pointerOne < pointerTwo) {
            int sum = nums[pointerOne]+nums[pointerTwo];
            if (sum == target) {return new  int []{pointerOne, pointerTwo}; }
            if (sum < target) pointerOne++; 
            else if (sum > target) pointerTwo--;
        }
        return nums;
    }

    public int[] sort(int[] vals) {

         Arrays.sort(vals);
         return vals;
    }
}