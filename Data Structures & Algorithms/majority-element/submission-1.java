class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        int max=0;
        int value=0;
        for(int i=0;i<nums.length;i++){
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
             if(map.get(nums[i])>max){
                max=map.get(nums[i]);
            }

             if(map.get(nums[i])==max){
                 value=nums[i];
            }

        }
        
        // for(int n:map.keySet()){

        //     if(map.get(n)>max){
        //         max=map.get(n);
        //     }
        //}
        
        
       
        // for(int n:map.keySet()){
        //     if(map.get(n)==max){
        //          value=n;
        //     }
        // }
     
        return value;
    }
}