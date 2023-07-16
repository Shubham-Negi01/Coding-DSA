public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxAr = Math.min(l,r) * (r-l);
        
        return maxAr;
    }

}
