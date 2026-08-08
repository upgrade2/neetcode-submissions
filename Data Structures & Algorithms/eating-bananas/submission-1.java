class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=0;
        int max = Arrays.stream(piles).max().getAsInt();
        int low=1,high=max;
        while(low<=high){
            int mid = (low+high)/2;
            int totalHrs = functionTotalHr(piles,mid);
            if(totalHrs<=h){
                ans = mid;
                high = mid-1;
            }
            else low= mid+1;
        }
        return ans;
    }
    private int functionTotalHr(int[] arr , int speed){
        int totalTime = 0;
        for(int n:arr){
            totalTime += Math.ceil((double) n/speed);
        }
        return totalTime;
    }
}
