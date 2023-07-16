import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int l = nums.length;
        if(l<4) return list;
        Arrays.sort(nums);
        for(int i=0 ; i<l-3;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<l-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int left = j+1, right=l-1;
                while(left<right){
                    long a = nums[i], b = nums[j], c = nums[left], d = nums[right];
                    long sum = a+b+c+d;
                    if(sum==target){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        list.add(temp);

                        right--;

                        while(right>left && nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                    else if(sum>target){
                        right--;
                        while(right>left && nums[right]==nums[right+1]){
                            right--;
                        }
                    }
                    else{
                        left++;
                        while(right>left && nums[left]==nums[left-1]){
                            left++;
                        }
                    }
                }
            }
        }
        return list;
    }

}
