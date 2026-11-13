class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n = nums1.length , m = nums2.length ;
       int[] res = new int[n + m] ;
       int i = 0 , j = 0 , k = 0 ;
       while(i < n && j < m){
        if(nums1[i] < nums2[j]){
            res[k] = nums1[i] ;
            i++ ;
        }
        else {
            res[k] = nums2[j] ;
            j++ ;
        }
        k++ ;
       }
       while(i < n){
         res[k] = nums1[i] ;
         i++ ;
         k++ ;
       }
       while(j < m){
        res[k] = nums2[j] ;
        j++ ;
        k++ ;
       }
       int total = n + m ;
       if(total % 2 == 1){
         return res[(m + n) / 2] ;
       }
       return ((double) (res[(m + n) / 2 - 1] + res[(m + n)/2] )/ 2.0) ;

    }
}