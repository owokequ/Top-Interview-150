/**
 * LeetCode #11 — Container With Most Water
 * 
 */
public class ContainerWithMostWater {
    public static void main(String[] str) {
        System.out.println(maxArea(new int[] { 3, 1, 2, 4 }));
    }

    public static int maxArea(int[] height) {
        int area = 0;
        int l = 0;
        int r = height.length - 1;
        int currentArea;
        while (l < r) {
            int currentLength = r - l;
            if (height[l] >= height[r]) {
                currentArea = currentLength * height[r];
                r--;
            } else {
                currentArea = currentLength * height[l];
                l++;
            }
            if (currentArea > area) {
                area = currentArea;
            }

        }

        return area;
    }
}
