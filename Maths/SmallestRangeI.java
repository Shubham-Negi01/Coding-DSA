package Maths;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int x : nums) {
            min = (x < min) ? x : min;
            max = (x > max) ? x : max;
        }

        int diff = max - min;
        int range = 2 * k;
        return (range >= diff) ? 0 : (diff - range);
    }
}
