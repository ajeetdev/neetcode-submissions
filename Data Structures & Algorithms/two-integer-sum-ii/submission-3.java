class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] nums=numbers;

        HashMap<Integer,Integer> map=new HashMap<>();

     for(int i=0;i<nums.length;i++){

        int left= target-nums[i];

        if(map.containsKey(left)){
            return new int[]{map.get(left)+1,i+1};
        }

        map.put(nums[i],i);

       
     }
     return new int []{};


    }
}
