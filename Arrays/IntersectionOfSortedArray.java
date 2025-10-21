import java.util.ArrayList;
import java.util.List;

/*
Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]

Output: [1, 2]

Explanation:

The elements 1, 2 are the only elements present in both nums1 and nums2
 */
public class IntersectionOfSortedArray {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int numSize1 = nums1.length;
        int numSize2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i < numSize1 && j < numSize2){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                i++;
            }
        }

//        while (i < numSize1){
//            if (nums1[i] == nums2[numSize2-1]){
//                list.add(nums1[i]);
//            }
//            i++;
//        }
//
//        while (j < numSize2){
//            if (nums2[j] == nums1[numSize1-1]){
//                list.add(nums2[j]);
//            }
//            j++;
//        }

        for(int lis : list){
            System.out.println(lis);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String args[]){
        int[] nums1 = {-17,-1,-1,3};
        int[] nums2 = {-17,0,3,3};

        IntersectionOfSortedArray intersectionOfSortedArray = new IntersectionOfSortedArray();
        int[] result = intersectionOfSortedArray.intersectionArray(nums1,nums2);
    }
}
