class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)return false;
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        char[] chars = s.toCharArray();
        int i=0,j=s.length()-1;

        while(i<j){
            if(chars[i]==chars[j]){
            i++;
            j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
