class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        l.add(intervals[0][0]);
        l.add(intervals[0][1]);
        res.add(new ArrayList<>(l));
        for (int i = 1; i < intervals.length; i++) {
            List<Integer> last = res.get(res.size() - 1);
            int[] current = intervals[i];
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