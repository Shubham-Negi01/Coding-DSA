import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int l = nums.length;
        int sum = nums[0] + nums[1] + nums[2];
        for(int i=0;i<l-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int left = i+1;
            int right = l-1;
            while(left<right){
                int x = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - x) < Math.abs(target - sum)){
                    sum = x;
                }
                else if(x<target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return sum;
    }
}
