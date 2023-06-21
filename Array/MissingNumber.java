import java.util.Arrays;

public class MissingNumber {
   int missingNumber(int array[], int n) {
      Arrays.sort(array);
      for(int i = 0 ;i<n-1;i++){
         if(array[i]!=(i+1)){
               return (i+1);
         }
      }
      return n;
   }
}
