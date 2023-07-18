import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int l = nums.length;
        int i = l-2;
        while (i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        
        if(i==-1) {
            //array is reversed, need to arrange in acsending order.
            Arrays.sort(nums);
        }
        else {
            //find smallest number greater than nums[i] after nums[i].

            int smallestLarger = nums[i+1], index = i+1;
            for(int j=i+1;j<l;j++){
                if(smallestLarger > nums[j] && nums[j] > nums[i]) {
                    smallestLarger = nums[j];
                    index = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
            Arrays.sort(nums,i+1,l);
        }
    }
}
