//Given an integer array nums, rotate the array to the left by one.
//
//
//
//Note: There is no need to return anything, just modify the given array.
//
//
//        Examples:
//Input: nums = [1, 2, 3, 4, 5]
//
//Output: [2, 3, 4, 5, 1]
//
//Explanation:
//
//Initially, nums = [1, 2, 3, 4, 5]
//
//Rotating once to left -> nums = [2, 3, 4, 5, 1]

public class LeftRotatArrayByOne {
    public void rotateArrayByOne(int[] nums) {
        int startingIndexValue = nums[0];
        for(int i=0; i<nums.length; i++) {
            if(i == nums.length-1)
                nums[i] = startingIndexValue;
            else
                nums[i] = nums[i+1];

        }
    }

    public static void main(String args[]){
//        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        int[] nums = {1, 2, 3, 4, 5};
        LeftRotatArrayByOne leftRotatArrayByOne = new LeftRotatArrayByOne();
        leftRotatArrayByOne.rotateArrayByOne(nums);
    }
}
