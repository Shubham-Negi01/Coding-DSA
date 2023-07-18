
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        if(l<2) return 1;
        /* List<Integer> indices = new ArrayList<Integer>();
        indices.add(nums[0]);
        for(int i = 1 ; i < l ; i++) {
            if(nums[i]!=nums[i-1]){
                k++;
                indices.add(nums[i]);
            }
        }
        for(int i = 0 ; i<k;i++){
            nums[i] = indices.get(i);
        } 
        return k;
        */
        //two-pointer method:
        int i=0,j=1;
        while(j<l){
            if(nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
