package com.colinf.code.src;

public class SolutionTwoSum {

    public int[] twoSumSorted(int[] nums, int target) {

        // use two pointers 
        int pointerOne = 0;
        int pointerTwo = nums.length -1 ; 
        
        // traverse based on sum vs target
        while (pointerOne < pointerTwo) {
            int sum = nums[pointerOne]+nums[pointerTwo];
            if (sum == target) {return new  int []{nums[pointerOne], nums[pointerTwo]}; }
            if (sum < target) pointerOne++; 
            else if (sum > target) pointerTwo--;
        }
        return nums;
    }
}