class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1){
            return nums ;
        }
        int left = 0 ;
        for(int right = 0 ; right < nums.length ; right++){
            if(nums[right] % 2 == 0){
                int temp = nums[right] ;
                nums[right] = nums[left] ;
                nums[left] = temp ;
                left++ ;
            }
        }
    return nums ;
    }
}