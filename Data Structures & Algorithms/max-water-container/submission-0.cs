public class Solution {
    public int MaxArea(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.Length - 1;
        int maxWater = 0;

        while(leftIndex < rightIndex){
            int area = (rightIndex - leftIndex) * Math.Min(heights[leftIndex], heights[rightIndex]);
            maxWater = Math.Max(maxWater, area);
            if(heights[leftIndex] < heights[rightIndex]){
                leftIndex++;
            }else{
                rightIndex--;
            }
        }

        return maxWater;
    }
}
