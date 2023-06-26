/*Question 3
We define a harmonious array as an array where the difference between its maximum value
and its minimum value is exactly 1.

Given an integer array nums, return the length of its longest harmonious subsequence
among all its possible subsequences.

A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5

Explanation: The longest harmonious subsequence is [3,2,2,2,3]. */

package PPT.AS_2;

import java.util.*;

public class Q3_longestHarmoniousSubsequence {

    static int findLHS(int[] nums) {
        
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for(int i : nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        for(int i : count.keySet()){
            if(count.containsKey(i+1)){
                result = Math.max(result, count.get(i) + count.get(i+1));
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        
        int [] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));


    }
}
