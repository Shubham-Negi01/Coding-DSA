public class EquilibriumPoint {

    public static int equilibriumPoint(long arr[], int n) {

        if(n==1) return 1;
        if(n==2) return -1;

        long totalSum = 0;
        for(long x : arr){
            totalSum+=x;
        }

        long leftSum = arr[0];

        for(int i=1 ; i<n-1; i++){
            if(leftSum == (totalSum - leftSum - arr[i])){
                return i+1;
            }
            leftSum += arr[i];
        }

        return -1;
    }
}
