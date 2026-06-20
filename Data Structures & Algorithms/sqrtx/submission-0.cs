public class Solution {
    public int MySqrt(int x) {
        int left = 1; 
        int right = x;

        while(left<=right){
            int middle = left + (right - left) / 2;
            long middleSquere = (long)middle*middle;

            if(middleSquere == x){
                return middle;
            }else if (middleSquere < x){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
   
        }

        return right;

    }
}