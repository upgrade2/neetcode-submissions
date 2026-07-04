class Solution {
    public int longestConsecutive(int[] nums) {
    if(nums.length==0)return 0;
    int longest =1;
    HashSet<Integer> hashSet = new HashSet<>();
    for(int num:nums){
        hashSet.add(num);
    }
    for(int num:nums){
        if(!hashSet.contains(num-1)){
            int count = 1;
            int x=num;
            while(hashSet.contains(x+1)){
                x++;
                count++;
            }
            longest = Math.max(longest,count);
        }
    }
    return longest;
    }
}
