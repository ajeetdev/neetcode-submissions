class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        // Step 1: Insert elements into HashSet
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums) {
            set.add(n);
        }

        int maxCount = 0;

        // Step 2: Find the starting point of sequences
        for(int n : set) {

            if(!set.contains(n - 1)) {

                int current = n;
                int count = 1;

                // Step 3: Count consecutive elements
                while(set.contains(current + 1)) {
                    current++;
                    count++;
                }

                // Step 4: Update maximum length
                maxCount = Math.max(maxCount, count);
            }
        }

          return maxCount;
    }
}
