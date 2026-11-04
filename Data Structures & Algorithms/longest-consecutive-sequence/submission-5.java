class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);


        int maxCount=1;
        int count=1;

        
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){

            if(nums[i-1]==nums[i]) continue;

            if(nums[i-1]+1==nums[i]) {
                
                count++;
                maxCount=Math.max(count,maxCount);
                
            }else{
                count=1;
            }

        }

      return maxCount;    
    }
}
