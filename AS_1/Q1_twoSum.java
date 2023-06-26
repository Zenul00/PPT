/*<aside>
💡 **Q1.** Given an array of integers nums and an integer target, return
indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may
not use the same element twice.

You can return the answer in any order.

**Example:**
Input: nums = [2,7,11,15], target = 9
Output0 [0,1]

**Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][

</aside> */

package PPT.AS_1;

import java.util.Scanner;


public class Q1_twoSumTarget {

    static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    static void printArray(int arr[]){

        if(arr == null){
            System.out.println("Null");
            return ;
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter size of an Array");      
        int l = sc.nextInt();

        int nums [] = new int [l];

        System.out.println("Enter elements");
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int x = sc.nextInt();

        printArray(twoSum(nums, x));

    }
}
