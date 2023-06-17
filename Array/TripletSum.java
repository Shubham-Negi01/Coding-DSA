import java.util.*;

class TripletSum{
   int countTriplet(int arr[], int n) {
        int triplets=0;
        Arrays.sort(arr);

        for(int i = n-1 ; i >= 2 ; i--){
            int left = 0, right = i-1;
            while(left<right){
                int sum = arr[left] + arr[right];
                if(sum==arr[i]){
                    triplets++;
                    left++;
                    right--;
                }
                else if(sum<arr[i]){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return triplets;
    }

}