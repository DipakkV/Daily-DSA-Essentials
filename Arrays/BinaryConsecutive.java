class BinaryConsecutive{
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            if(nums[i] == 0){
                count = 0;
            }
        }

        return maxCount;

    }

    //Instead of Add maxCount at two places it can simply added in one that that it just after evidicing the 1

    public static void main(String args[]){
//        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0};
        int[] nums = {1};

        BinaryConsecutive binaryConsecutive = new BinaryConsecutive();
        int result = binaryConsecutive.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}