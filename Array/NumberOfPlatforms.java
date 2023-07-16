import java.util.Arrays;

public class NumberOfPlatforms {
    
    static int findPlatform(int arr[], int dep[], int n) {
        
        if(n==1) return 1;

        int platforms = 1;
        Arrays.sort(dep);
        int i = 1, j = 0;
        int maxPlatforms = platforms;
        while(i!=n) {
            if(dep[j]<arr[i]){
                while(dep[j]<arr[i]){
                    j++;
                    platforms--;
                }
                if(i==j){
                    platforms = 1;
                }
            }
            else{
                platforms++;
                maxPlatforms = (maxPlatforms > platforms) ? maxPlatforms : platforms;
            }
            i++;
        }
        return maxPlatforms;
    }

}
