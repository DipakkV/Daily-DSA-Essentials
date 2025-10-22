import java.util.ArrayList;

/*
Input : nums = [2, 4, 5, -1, -3, -4]

Output : [2, -1, 4, -3, 5, -4]

Explanation:

The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
 */
public class RearragneElementBySign {
//    public int[] rearrangeArray(int[] nums) {
//        int arrSize = nums.length;
//        ArrayList<Integer> posList = new ArrayList<>();
//        ArrayList<Integer> negList = new ArrayList<>();
//        ArrayList<Integer> ansList = new ArrayList<>();
//        for(int i=0; i<arrSize; i++){
//            if(nums[i] > 0){
//                posList.add(nums[i]);
//            }else {
//                negList.add(nums[i]);
//            }
//        }
//        int ps = 0, ns = 0;
//        for(int i=0; i<arrSize / 2; i++){
////            if(i%2==0){
////                ansList.add(posList.get(ps));
////                ps++;
////            }else {
////                ansList.add(negList.get(ns));
////                ns++;
////            }
//                nums[2 * i] = posList.get(i);
//                nums[2 * i + 1] = negList.get(i);
//            }
////        }
//
////        return ansList.stream().mapToInt(Integer::intValue).toArray();
//    return nums;
//    }

/* optimal Approach
 */
public int[] rearrangeArray(int[] nums) {
    int arrSize = nums.length;
    int[] redudentArray = new int[arrSize];
    int posIndex = 0, negIndex = 1;
    for(int i=0; i<arrSize; i++){
        if(nums[i] > 0){
            redudentArray[posIndex] = nums[i];
            posIndex += 2;
        } else {
            redudentArray[negIndex] = nums[i];
            negIndex += 2;
        }
    }

    return redudentArray;
}

    public static void main(String[] var0) {
        int[] var1 = new int[]{2, 4, 5, -1, -3, -4};
        RearragneElementBySign rearragneElementBySign = new RearragneElementBySign();
        rearragneElementBySign.rearrangeArray(var1);
    }
}
