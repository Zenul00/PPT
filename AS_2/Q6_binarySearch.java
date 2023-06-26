/*Question 6
Given an array of integers nums which is sorted in ascending order, and an 
integer target, write a function to search target in nums. If target exists, 
then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4

Explanation: 9 exists in nums and its index is 4 */

package PPT.AS_2;

public class Q6_binarySearch {

    static int search(int[] nums, int target) {

        int start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;        
    }

    public static void main(String[] args) {

        int [] nums = {-1,0,3,5,9,12};
        int target = 2;

        System.out.println(search(nums, target));
    }
}
