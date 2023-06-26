/*Question 5
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

Example 1:
Input: nums = [1,2,3]
Output: 6 */

package PPT.AS_2;

import java.util.Arrays;

public class Q5_maximumProductOfThreeNumsers {

    static int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int product = Math.max(nums[0] * nums[1] * nums[n-1] , 
        nums[n-1] * nums[n-2] * nums[n-3]);
        return product;
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3,-7,4,5,6,-8};
        System.out.println(maximumProduct(nums));
        
    }
}
