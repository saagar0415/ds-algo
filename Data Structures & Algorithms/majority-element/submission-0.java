class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
// The majority element appears more than n / 2 times.
// We keep:
// candidate → possible majority element
// count → vote counter
// Same numbers increase count.
// Different numbers decrease count.
// The majority element survives in the end.