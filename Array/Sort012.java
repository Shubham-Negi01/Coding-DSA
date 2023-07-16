public class Sort012 {
    
    public static void sort012(int a[], int n) {

        int zeros = 0, ones = 0, twos = 0;
        for(int x:a){
            switch(x){
                case 0:
                    zeros++;
                    break;
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
            }
        }
        for(int i = 0 ; i<zeros; i++){
            a[i] = 0;
        }
        for(int i = zeros ; i<(zeros+ones); i++){
            a[i] = 1;
        }
        for(int i = (zeros+ones) ; i<(zeros+ones+twos); i++){
            a[i] = 2;
        }
         
    }

}
