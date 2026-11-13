class Solution {
    public boolean isPalindrome(String s) {
          if(s.isEmpty()){
            return true ;
          }
          int left = 0 , right = s.length() - 1 ;
          while(left < right){
            char curl = s.charAt(left) ;
            char curr = s.charAt(right) ;
            if(!Character.isLetterOrDigit(curl)){
                left++ ;
            }
            else if(!Character.isLetterOrDigit(curr)){
                right-- ;
            }
            else{
                if(Character.toLowerCase(curl) != Character.toLowerCase(curr)){
                    return false ;
                }
                left++ ;
                right-- ;
            }
        }
    return true ;
    }
}
