class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [][]interval=new int[intervals.length+1][2];
        boolean inserted = false;
        int k=0;
        // 1. Correctly insert newInterval into the sorted array
        for (int i = 0; i < intervals.length; i++) {
            if (!inserted && newInterval[0] < intervals[i][0]) {
                interval[k][0] = newInterval[0];
                interval[k][1] = newInterval[1];
                k++;
                inserted = true;
            }
            interval[k][0] = intervals[i][0];
            interval[k][1] = intervals[i][1];
            k++;
        }
        
        // If newInterval belongs at the very end (or intervals was empty)
        if (!inserted) {
            interval[k][0] = newInterval[0];
            interval[k][1] = newInterval[1];
        }
       

  List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
       
        l.add(interval[0][0]);
        l.add(interval[0][1]);
        res.add(new ArrayList<>(l));
        for (int i = 1; i < interval.length; i++) {
            List<Integer> last = res.get(res.size() - 1);
            int[] current = interval[i];
            if (current[0] <= last.get(1)) {
                int minr = Math.min(current[0], last.get(0));
                int maxr = Math.max(current[1], last.get(1));
                last.add(0, minr);
                last.add(1, maxr);
            } else {
                List<Integer> l1 = new ArrayList<>();
                l1.add(current[0]);
                l1.add(current[1]);
                res.add(new ArrayList<>(l1));
            }

        }
        int [][]ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            List<Integer>l2=res.get(i);
            ans[i][0]=l2.get(0);
            ans[i][1]=l2.get(1);
        }
     return ans;






        
    }
}