/**
 * LeetCode #27 — Remove Element
 *
 */
public class RemoveElement {

    public static void main(String[] args) {
        int k = removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println(k);
    }

    public static  int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int buffer;
        while(left <= right){
            if(nums[left] == val && nums[right] != val){
                buffer = nums[left];
                nums[left] = nums[right];
                nums[right] = buffer;
                left++;
                right--;
            }else if(nums[left] == val && nums[right] == val){
                right--;
            } 
            else{
                left++;
            }
        }
        
        return right + 1;
    }

}
