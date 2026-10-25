class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums) ;
        int left = 0 , right = nums.length - 1 ;
        int count = 0 ;
        while(left < right){
            int target = nums[left] + nums[right] ;
            if(target == k){
                count++ ;
                left++ ;
                right-- ;
            }else if(target < k){
                left++ ;
            }else{
                right-- ;
            }
        }
    return count ;
    }
}