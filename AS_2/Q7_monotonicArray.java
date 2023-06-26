/*Question 7
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

Example 1:
Input: nums = [1,2,2,3]
Output: true */

package PPT.AS_2;

public class Q7_monotonicArray {

    static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                increasing = false;
            }
            if(nums[i] < nums[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
        
    }
    public static void main(String[] args) {

        int [] nums = {1,2,2,4};
        System.out.println(isMonotonic(nums));
        
    }
}
