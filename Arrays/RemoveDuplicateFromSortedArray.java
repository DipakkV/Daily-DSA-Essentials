//Input: nums = [0, 0, 3, 3, 5, 6]
//
//Output: 4
//
//Explanation:
//
//Resulting array = [0, 3, 5, 6, _, _]
//
//There are 4 distinct elements in nums and the elements marked as _ can have any value.

import java.util.ArrayList;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;

        for(int i=1; i<n; i++){
            if(nums[i] != nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{0, 0, 3, 3, 5, 6};
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        int result = removeDuplicateFromSortedArray.removeDuplicates(var1);
        System.out.println(result);
    }
}
