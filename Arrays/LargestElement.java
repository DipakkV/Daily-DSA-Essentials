//Given an array of integers nums, return the value of the largest element in the array
//
//
//Examples:
//Input: nums = [3, 3, 6, 1]
//
//Output: 6
//
//Explanation: The largest element in array is 6

public class LargestElement {
    public int largestElement(int[] nums) {
            int max = Integer.MIN_VALUE;
            for(int num : nums){
                max = Math.max(max,num);
            }
            return max;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        LargestElement largestElement = new LargestElement();
        int result = largestElement.largestElement(nums);
        System.out.println(result);
    }


}
