class Solution {
    public int[][] merge(int[][] intervals) {
      List<int[]> result = new ArrayList<>() ;
      Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0])) ;
      result.add(intervals[0]) ;
      for(int i = 0 ; i <intervals.length ; i++){
        int[] last = result.get(result.size() - 1) ;
        int[] current = intervals[i] ;
        if(current[0] <= last[1]){
            last[1] = Math.max(last[1] , current[1]) ;
        }else{
            result.add(current) ;
        }
      }
    return result.toArray(new int[result.size()][]) ;
    }
}

