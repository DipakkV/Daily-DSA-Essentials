/*
Given an integer array nums, return a list of all the leaders in the array.

A leader in an array is an element whose value is strictly greater than all elements to its right in the given array.
The rightmost element is always a leader.
The elements in the leader array must appear in the order they appear in the nums array.

Input: nums = [1, 2, 5, 3, 1, 2]

Output: [5, 3, 2]

Explanation:
2 is the rightmost element, 3 is the largest element in the index range [3, 5], 5
is the largest element in the index range [2, 5]
 */


import java.util.ArrayList;
import java.util.List;

public class LeaderInArray {
    public List<Integer> leaders(int[] nums) {
        int arrSize = nums.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arrSize-1; i++){
            boolean offSet = false;
            for(int j = i+1; j < arrSize; j++){
                if(nums[j] >= nums[i]){
                    offSet = true;
                    break;
                }
            }
            if(!offSet){
                result.add(nums[i]);
            }
        }
        result.add(nums[arrSize-1]);
//        for(int res : result){
//            System.out.println(res);
//        }
        return result;
    }

    public static void main(String[] var0) {
        int[] var1 = new int[]{-3, 4, 5, 1, -4, -5};
        LeaderInArray leaderInArray = new LeaderInArray();
        leaderInArray.leaders(var1);
    }
}
