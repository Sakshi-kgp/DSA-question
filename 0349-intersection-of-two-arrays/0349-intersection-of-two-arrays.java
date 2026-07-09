class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)s1.add(nums1[i]);
         Set<Integer>s2=new HashSet<>();
        for(int i=0;i<nums2.length;i++)s2.add(nums2[i]);


        ArrayList<Integer>l=new ArrayList<>();
        for(int ele:s1){
            if(s2.contains(ele))l.add(ele);
        }
        int []ans=new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i]=l.get(i);
        }
        return ans;
        
    }
}