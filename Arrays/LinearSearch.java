// Given an array of integers nums and an integer target, find the smallest index (0 based indexing)
// where the target appears in the array. If the target is not found in the array, return -1.


// Examples:
// Input: nums = [2, 3, 4, 5, 3], target = 3

// Output: 1

public class LinearSearch {

    public int linearSearch(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (target == nums[index]) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int result = search.linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
