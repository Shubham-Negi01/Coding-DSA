package algebra;

public class BinaryExponential {

    public static void main(String[] args) {
        System.out.println(binExpo(3,13));
    }

    private static long binExpo(int x, int y){
        if(y==0) return 1;

        else if(y%2==0){
            long p = binExpo(x,y/2);
            return p*p;
        }

        else {
            long p = binExpo(x,(y-1)/2);
            return p*p*x;
        }
    }

}
