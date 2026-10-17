import java.util.Arrays;

/**
 * LeetCode #167 — Two Sum II - Input Array Is Sorted
 * 
 */
public class TwoSumIIInputArrayIsSorted {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4,5,6,7,8,9,10}, 8)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l <= r){
            if(numbers[r] + numbers[l] > target){
                r--;
            } else if(numbers[r] + numbers[l] < target){
                l++;
            }
            else {
                return new int[]{l + 1, r + 1};
            }
        }

        return new int[]{-1,-1};
    }
}


//[1,2,3,4,5,6,7,8,9,10]