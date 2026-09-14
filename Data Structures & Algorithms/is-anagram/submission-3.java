class Solution {
    public boolean isAnagram(String s, String t) {

    HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
    HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
    
    if(s.length()!=t.length()){
        return false;
    }

    
   for(char c:s.toCharArray()){
        int value=1;
        if(map1.containsKey(c)){
            value= map1.get(c);
            value++;

        }
        map1.put(c,value);

   }

    for(char c:t.toCharArray()){
        int value=1;
        if(map2.containsKey(c)){
            value= map2.get(c);
            value++;

        }
        map2.put(c,value);

   }

    boolean flag=map1.equals(map2);
   

    return flag;
        

    }
}
