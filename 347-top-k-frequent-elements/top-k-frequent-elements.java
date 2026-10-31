class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>() ;
       for(int num : nums){
         map.put(num , map.getOrDefault(num , 0) + 1) ;
       }
       PriorityQueue<Integer> freq = new PriorityQueue<>((a,b)-> map.get(b) - map.get(a)) ;
       freq.addAll(map.keySet()) ;

       int []result = new int[k] ;
       for(int i = 0 ; i < k ; i++){
        result[i] = freq.poll() ;
       }
       return result ;
    }
}

       



  

    

