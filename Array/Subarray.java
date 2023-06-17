import java.util.*;

class Subarray{
   static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int sum = 0, left=0;
        for(int i=0;i<n;i++){
            if(sum<s){
                sum += arr[i];
                if(sum==s){
                    return new ArrayList<Integer>(Arrays.asList(left,i));
                }
                else if(sum>s){
                    sum-=arr[left++];
                }
            }
        }
        return new ArrayList<Integer>(Arrays.asList(-1));
    }

}