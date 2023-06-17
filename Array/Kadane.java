class Kadane{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){   
        long sum=arr[0], largest=arr[0];
        for(int i=1;i<n;i++){
            if(sum<0)
               sum=0;
            sum+=arr[i];
            
            largest = largest < sum ? sum : largest;
        }
        
        return largest;
    }
    
}
