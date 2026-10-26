class Solution {
    public boolean isPalindrome(String s) {
        String txt= s.replaceAll("[^a-zA-Z0-9]","");
        txt=txt.toLowerCase();

        int left=0;
        int right=txt.length()-1;

        while(left<right){

            if(txt.charAt(left)!=txt.charAt(right)){
                return false;
            }

            left++;
            right--;

            
        }
        
        return true;
        
        
    }
}       
  
