/*<aside>
💡 **Q7.** Given an integer array nums, move all 0's to the end of it while 
maintaining the relative order of the nonzero elements.

Note that you must do this in-place without making a copy of the array.

**Example 1:**
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

</aside> */

package PPT.AS_1;

import java.util.Arrays;

public class Q7_moveZeros {

    static void moveZeroes(int[] nums) {
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++)
            if(nums[j] != 0){
                int temp =  nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {

        int [] nums = {0,0,0,1,0,3,12,15,32,0};
        moveZeroes(nums);

    }
    
}
