class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;
        String lowerS = s.toLowerCase();

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(lowerS.charAt(left))){
                    left++;
            }

            while(left < right && !Character.isLetterOrDigit(lowerS.charAt(right))){
                right--;
            }

            if(lowerS.charAt(left) != lowerS.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }

        return true;
    }
}