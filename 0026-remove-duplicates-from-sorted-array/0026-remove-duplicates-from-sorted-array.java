class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1; // Start writing from second index
        for (int i = 1; i < nums.length; i++) {
            // If current number is not equal to the previous one, it's unique
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // Write the unique number at index j
                j++; // Move to the next position
            }
        }
        return j; // j is the count of unique numbers
    }
}
    