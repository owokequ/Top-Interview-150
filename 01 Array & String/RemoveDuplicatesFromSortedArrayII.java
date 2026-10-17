/**
 * LeetCode #80 — Remove Duplicates from Sorted Array II
 * 
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                counter = 1;
            } else {
                counter++;
            }

            if(counter <= 2){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
