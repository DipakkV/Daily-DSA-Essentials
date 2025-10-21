/*
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation:

The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2
 */


import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int numSize1 = nums1.length;
        int numSize2 = nums2.length;
        List<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i < numSize1 && j < numSize2){
            if(nums1[i] == nums2[j]){
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);

                }
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                if(!list.contains(nums2[j])){
                    list.add(nums2[j]);
                }
                j++;
            }else {
                if(!list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
                i++;
            }
        }

        if(i < numSize1){
            for(int k = i; k < numSize1; k++){
                if(!list.contains(nums1[k])){
                    list.add(nums1[k]);

                }
            }
        }

        if(j < numSize2){
            for(int l = j; l < numSize2; l++){
                if(!list.contains(nums2[l])){
                    list.add(nums2[l]);
                }
            }

        }
        for(int lis : list){
            System.out.println(lis);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String args[]){
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        UnionOfSortedArrays unionOfSortedArrays = new UnionOfSortedArrays();
        int[] result = unionOfSortedArrays.unionArray(nums1,nums2);
//        System.out.println(result);
    }
}
