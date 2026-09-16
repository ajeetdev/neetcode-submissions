class Solution {
    public String longestCommonPrefix(String[] strs) {

        String result="";
        char[] myWord=strs[0].toCharArray();

         if (strs == null || strs.length == 0) {
            return result;
        }

        if(strs.length==1){

            result=strs[0];
            return result;
           
        }

    

        for(int i=0;i<strs[0].length();i++){

            for(int j=0;j<strs.length-1;j++){

                char[] left=strs[j].toCharArray();
                char[] right=strs[j+1].toCharArray();

                 if (i >= left.length || i >= right.length) {
                    return result;
                }
                if(left[i]!=right[i]){
                    return result;
                }         
                if(j==strs.length-2){
                    char c=myWord[i];
                    result+=c;
                }
                  
            }
            
        }

            return result;

    }
}