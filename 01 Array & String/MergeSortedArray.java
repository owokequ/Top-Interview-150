/**
 * LeetCode #88 — Merge Sorted Array
 * 
 * Идея: У нас два отсортированных массива, поэтому можем вставлять элементы с конца
 *  
 * 
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        merge(null, 0, null, 0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int one = m - 1; // последнее настоящие число в nums1
        int two = n - 1; // последнее число в nums2
        int three = m + n - 1; // последнея позиция результата

        while (two >= 0) {
            if(one >= 0 && nums1[one] > nums2[two]){
                nums1[three] = nums1[one];
                one--;
            } else {
                nums1[three] = nums2[two];
                two--;
            }
            three--;
        }
    }
}
