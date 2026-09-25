class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        String lowerS = s.toLowerCase();

        while(left < right){
            if(!Character.isLetterOrDigit(lowerS.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(lowerS.charAt(right))){
                right--;
            }else{
                if(lowerS.charAt(left) != lowerS.charAt(right)){
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}