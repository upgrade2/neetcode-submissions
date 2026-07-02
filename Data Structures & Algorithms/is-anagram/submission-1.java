class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        char[] sArray=s.toCharArray();
        char[] tArray=t.toCharArray();
        if(sArray.length!=tArray.length)return false;

        for(int i=0;i<s.length();i++){
            if(!mapS.containsKey(sArray[i])){
                mapS.put(sArray[i],1);
            }
            else{
                mapS.put(sArray[i],mapS.get(sArray[i])+1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(!mapT.containsKey(tArray[i])){
                mapT.put(tArray[i],1);
            }
            else{
                mapT.put(tArray[i],mapT.get(tArray[i])+1);
            }
        }

        return mapT.equals(mapS);
    }
}
