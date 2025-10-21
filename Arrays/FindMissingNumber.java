/*
Input: nums = [0, 2, 3, 1, 4]

Output: 5
 */

import java.util.Arrays;

public class FindMissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int arraySize = nums.length;
        for(int i=0; i < arraySize; i++){
            if(i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    /*
    Other Optimal Approch
            // Summation of first N natural numbers
        int sum1 = (N * (N + 1)) / 2;
     */

    public static void main(String[] var0) {
        int[] var1 = new int[]{0, 2, 3, 1, 4};
        FindMissingNumber findMissingNumber = new FindMissingNumber();
        int result = findMissingNumber.missingNumber(var1);
        System.out.println(result);
    }
}
