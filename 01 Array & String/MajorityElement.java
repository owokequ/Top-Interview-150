/**
 * LeetCode #169 — Majority Element
 * Идея:проходимся по массиву, если элемент встретился, ++; если нет --
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int balance = 0;

        for (int num : nums) {
            if (balance == 0) {
                candidate = num;
            }

            if (num == candidate) {
                balance++;
            } else {
                balance--;
            }
        }

        return candidate;
    }
}

// [2,2,1,1,1,2,2]