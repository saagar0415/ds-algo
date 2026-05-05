class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> visitedNumber = new HashMap<>();

        for (int i = 0 ; i< nums.length ; i++){
            if(visitedNumber.containsKey(nums[i]))
                return true;
            else {
                visitedNumber.put(nums[i], nums[i]);
            }
        }
        return false ; 
    }
}