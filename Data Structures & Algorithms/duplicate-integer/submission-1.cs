public class Solution {
    public bool hasDuplicate(int[] nums) {
        HashSet<int> numbers = new HashSet<int>();

        foreach(int x in nums){
            bool test = numbers.Add(x);
            if(!test){
                return true;
            }
        }

        return false;
        
    }
}