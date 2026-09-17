class Solution {
    public int removeElement(int[] nums, int val) {

       int l=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]==val){
                count++;
                
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];

                 }
                 if(nums[i]==val){
                    i--;
                 }

                  nums[l]=-1;
                  l--;
            }

        }
        
        return nums.length-count;
    }
}