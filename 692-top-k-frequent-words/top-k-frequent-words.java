class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>() ;
        for(String word : words){
            map.put(word , map.getOrDefault(word , 0) + 1) ;
        }
        PriorityQueue<String> queue = new PriorityQueue<>((a , b) -> {
            if(map.get(a).equals(map.get(b))){
                return a.compareTo(b) ;
            }
            return map.get(b) - map.get(a) ;
        }) ;
        queue.addAll(map.keySet()) ;
        List<String> list = new ArrayList<>() ;
        for(int i = 0 ; i < k ; i++){
            list.add(queue.poll()) ;
        }
    return list ;
    }
}