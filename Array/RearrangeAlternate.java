public class RearrangeAlternate {

    public static void rearrange(long arr[], int n){
        
        long max = 0;
        for(long x: arr){
            max = (max<x) ? x:max;
        }
        max++;

        int min_ind=0, max_ind=n-1;
        
        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[max_ind]%max)*max;
                max_ind--;
            }
            else {
                arr[i] = arr[i] + (arr[min_ind]%max)*max;
                min_ind++;
            }
        }

        for(int i=0;i<n;i++){
            arr[i]/=max;
        }
    }

}
