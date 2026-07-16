class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int prefix[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(max,nums[i]);

        }
       Arrays.sort(prefix);
       long sum=0;
       for(int i=0;i<n/2;i++){
        if(i==(n-i-1))continue;
         sum+=gcd(prefix[i],prefix[n-i-1]);


       }
       return sum;
        
    }
}