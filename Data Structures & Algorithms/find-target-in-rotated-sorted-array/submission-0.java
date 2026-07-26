class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)return mid;

            if(nums[low]<=nums[mid]){//To which part is sorted..
                //left is sorted  check in low -> mid
                if(target>=nums[low] && target<=nums[mid]){
                    high = mid-1;
                }
                else low = mid+1;
            }
            else{
                //right is sorted mid -> high
                if(target>=nums[mid] && target <= nums[high]){
                    low = mid+1;
                }
                else high = mid-1;

            } 
        }
        return -1;
    }
}
