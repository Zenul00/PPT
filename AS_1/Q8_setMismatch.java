/*<aside>
💡 **Q8.** You have a set of integers s, which originally contains all the numbers
 rom 1 to n. Unfortunately, due to some error, one of the numbers in s got 
 duplicated to another number in the set, which results in repetition of one 
 number and loss of another number.

You are given an integer array nums representing the data status of this set 
after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

**Example 1:**
Input: nums = [1,2,2,4]
Output: [2,3]

</aside> */

package PPT.AS_1;

import java.util.Arrays;

public class Q8_setMismatch {

    static int[] findErrorNums(int[] nums) {
        int dupli = 0, missing = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                dupli = nums[i];
                missing = nums[i] + 1;
                break;
            }
        }
        int [] arr = {dupli, missing};
        return arr;
        
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,3,5,6};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
