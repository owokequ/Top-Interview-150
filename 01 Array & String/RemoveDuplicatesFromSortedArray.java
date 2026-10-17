/**
 * LeetCode #26 — Remove Duplicates from Sorted Array
 * Идея: Если встречается, просто идем направо,как только не встретился, делаем + 1 слева и вставляем туда right
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[left] == nums[i]){
                continue;
            } else {
                left++;
                nums[left] = nums[i];
            }
        }
        return left + 1;
    }
}
