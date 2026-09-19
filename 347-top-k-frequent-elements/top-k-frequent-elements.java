class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>() ;
       for(int num : nums){
         map.put(num , map.getOrDefault(num , 0) + 1) ;
       }
       PriorityQueue<Map.Entry<Integer,Integer>> freq = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue()) ;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        freq.offer(entry) ;
        if(freq.size() > k){
            freq.poll() ;
        }
       } 
       int []result = new int[k] ;
       for(int i = 0 ; i < k ; i++){
        result[i] = freq.poll().getKey() ;
       }
       return result ;
    }
}

       



  

    

