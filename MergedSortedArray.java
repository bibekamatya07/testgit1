package LeetCode;

import java.util.Arrays;

public class MergedSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n;

        int [] mergedArray = new int [length];

        int count =0;
        for(int i = 0; i < nums1.length; i++){
            mergedArray[i] = nums1[i];
            count++;
        }

        for(int i =0; i < nums2.length; i++){
            mergedArray[count] = nums2[i];
            count++;
        }
        Arrays.sort(mergedArray);

        for(int i = 0; i < mergedArray.length; i++){
            System.out.print(mergedArray[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {10,2,3,4};
        int [] nums2 = {4,5,6};

        merge(nums1, nums1.length, nums2, nums2.length);

    }
}
