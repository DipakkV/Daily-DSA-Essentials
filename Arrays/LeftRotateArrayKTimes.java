//Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.
//
//
//        Examples:
//Input: nums = [1, 2, 3, 4, 5, 6], k = 2
//
//Output: nums = [3, 4, 5, 6, 1, 2]
//1 2 3 4 5 6
//0 1 2 3 4 5
/*
arraySize = 6
k = 2
i = k +1
i = size - k -> 4
 */
//arrayLength = 6
//k = 2
//k%arrayLength

//
//Explanation:
//
//rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
//
//rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

class LeftRotateArrayKTimes {
//    public void rotateArray(int[] nums, int k) {
//        int arraySize = nums.length;
//        List<Integer> tempArray = new ArrayList<>();
//        k = k % arraySize;
//
//        for(int i = 0; i < k; i++){
//            tempArray.add(nums[i]);
////            System.out.println(nums[i]);
//        }
//        for(int i = 0; i < arraySize - k; i++){
//            nums[i] = nums[i + k];
////            System.out.println(nums[i]);
////            System.out.println();
//        }
//        int cnt = 0;
//        for(int i = arraySize - k ; i < arraySize; i++ ){
////            System.out.println(i);
//            nums[i] = tempArray.get(cnt);
//            cnt++;
//            System.out.println(nums[i]);
//        }
//    }

    //can also be achived by reversing an array

public void reverse(int[] nums, int start, int end){
    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}

public void rotateArray(int[] nums, int k) {
    int arraySize = nums.length;
    k = k % arraySize;
    reverse(nums, 0, k - 1);
    reverse(nums, k, arraySize - 1);
    reverse(nums, 0 , arraySize - 1);

    for(int num : nums){
        System.out.println(num);
    }

}


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;
        LeftRotateArrayKTimes leftRotateArrayKTimest = new LeftRotateArrayKTimes();
        leftRotateArrayKTimest.rotateArray(nums,k);
    }

}