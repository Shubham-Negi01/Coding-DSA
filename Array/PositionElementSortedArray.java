public class PositionElementSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0)
            return new int[] { -1, -1 };
        int leftIndex = binarySearchLeft(nums,target,0,nums.length);
        int rightIndex = binarySearchRight(nums,target,0,nums.length);
        return new int[]{leftIndex,rightIndex};
    }

    private int binarySearchRight(int[] nums, int target, int l, int r) {
        if(l>r){
            return -1;
        }
        int m = (l+r)/2;
        if(nums[m]==target){
            if(m==r)
                return m;
            else{
                if(nums[r]==target)
                    return r;
                else
                    return binarySearchRight(nums, target, m, r-1);
            }
        }
        else if(nums[m]<target){
            return binarySearchRight(nums, target, m+1, r);
        }
        else{
            return binarySearchRight(nums, target, l, m-1);
        }
    }

    private int binarySearchLeft(int[] nums, int target, int l, int r) {
        if(l>r){
            return -1;
        }
        int m = (l+r)/2;
        if(nums[m]==target){
            if(m==l)
                return m;
            else{
                if(nums[l]==target)
                    return l;
                else
                    return binarySearchLeft(nums, target, l+1, m);
            }
        }
        else if(nums[m]<target){
            return binarySearchLeft(nums, target, m+1, r);
        }
        else{
            return binarySearchLeft(nums, target, l, m-1);
        }
    }
}
