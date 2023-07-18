public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {

        int l = 0, r = nums.length - 1;

        return rotatedBinarySearch(nums, target, l, r);
    }

    private int rotatedBinarySearch(int[] nums, int target, int l, int r) {
        if (l > r) {
            return -1;
        }
        int m = (l + r) / 2;
        if (nums[m] == target) {
            return m;
        }

        else if (nums[m] <= nums[r]) {
            // right part is sorted
            if (nums[m] < target && target <= nums[r])
                return rotatedBinarySearch(nums, target, m + 1, r);
            else {
                return rotatedBinarySearch(nums, target, l, m - 1);
            }
        }

        else {
            // left part is sorted
            if (nums[m] > target && target >= nums[l])
                return rotatedBinarySearch(nums, target, l, m - 1);
            else {
                return rotatedBinarySearch(nums, target, m + 1, r);
            }
        }
    }
}
