//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

//Examples:
//Input: nums = [8, 7, 8, 6, 5]



public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {

        if(nums.length <= 1){
            return -1;
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }else if(num != largest && num > secondLargest) {
                secondLargest = Integer.max(num, secondLargest);
            }
        }


        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String args[]){
//        int[] nums = {8, 7, 8, 6, 5};
        int[] nums = {10,10, 10, 10};

        SecondLargestElement secondLargestElement = new SecondLargestElement();
        int result = secondLargestElement.secondLargestElement(nums);
        System.out.println(result);
    }
}
