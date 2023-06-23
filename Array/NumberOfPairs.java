class NumberOfPairs
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int M, int N) {
        long pairs = 0;
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(x[i]==1)
                    continue;
                if(x[i]==2 || y[j]==2){
                    if(x[i]==2){
                        if(y[j]==1 || y[j]>4){
                            pairs++;
                        }
                    }
                    else{
                        if(x[i]==3)
                            pairs++;
                    }
                }
                else{
                    if(x[i]<y[j])
                        pairs++;
                }
            }
        }

        return pairs;
    }
}