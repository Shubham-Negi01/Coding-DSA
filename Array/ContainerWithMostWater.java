public class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        int l=0, r=height.length-1;
        int maxAr = Math.min(height[l],height[r]) * (r-l);
        while(l<r){
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
            maxAr = Math.max(maxAr,Math.min(height[l],height[r]) * (r-l));
        }
        return maxAr;
    }

}
