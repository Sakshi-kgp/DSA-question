class Solution {
     public  int NonOverlapping(int[][] arr) {
      int end=arr[0][1];int c=0;
        for(int i=1;i<arr.length;i++){
          if(arr[i][0]<end){
            c++;
            end=Math.min(end,arr[i][1]);

          }
          else end=arr[i][1];

    }
    return c;
     }
    public int eraseOverlapIntervals(int[][] interval) {
        Arrays.sort(interval,(a, b)->{
            
            return Integer.compare(a[0],b[0]);

            });
       

        return NonOverlapping(interval);
    }
   
}