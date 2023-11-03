package Maths;

public class ArrangingCoins {
    public int arrangeCoins(int n) {

        double pr = 8.0 * n + 1;

        int root = (int) Math.sqrt(pr);

        return (root - 1) / 2;
    }
}
