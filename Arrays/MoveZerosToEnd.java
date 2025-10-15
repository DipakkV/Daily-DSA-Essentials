//Input: nums = [0, 1, 4, 0, 5, 2]
//
//Output: [1, 4, 5, 2, 0, 0]
//
//Explanation:
//
//Both the zeroes are moved to the end and the order of the other elements stay the same



public class MoveZerosToEnd {

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        // j keeps track of where the next non-zero should be placed
        int j = 0;

        // Loop through all elements
        for (int i = 0; i < nums.length; i++) {
            // If current element is non-zero
            if (nums[i] != 0) {
                // Swap current element with the one at index j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                // Move j forward
                j++;
            }
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]){
        int[] nums = {0, 1, 4, 0, 5, 2};
        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();
        moveZerosToEnd.moveZeroes(nums);
    }
}
