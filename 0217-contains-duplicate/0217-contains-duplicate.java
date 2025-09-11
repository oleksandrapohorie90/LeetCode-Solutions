class Solution {
    // public boolean containsDuplicate(int[] nums) {
    // //O(n)^2
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;

    // }

    //O(n)
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            if (hs.contains(num)) {
                return true;
            }

            hs.add(num);
        }

        return false;
    }
}