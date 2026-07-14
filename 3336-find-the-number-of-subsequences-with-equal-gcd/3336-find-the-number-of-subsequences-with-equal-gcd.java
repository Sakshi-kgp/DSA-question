class Solution {
    int mod=1000000007;
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int subsequencePairCount(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int [][][]dp=new int[nums.length][max+1][max+1];
        for(int [][]m:dp){
            for(int []row:m){
                Arrays.fill(row,-1);
            }
        }
        return helper(0,0,0,dp,nums);
    }
    public int helper(int i,int gcd1,int gcd2,int [][][]dp,int []nums){
        if(i==nums.length){
            if(gcd1!=gcd2 || (gcd1==0 && gcd2==0))return 0;
            else return 1;
        }
        if(dp[i][gcd1][gcd2]!=-1)return dp[i][gcd1][gcd2];
  long c1=helper(i+1,gcd(gcd1,nums[i]),gcd2,dp,nums);
  long c2=helper(i+1,gcd1,gcd(gcd2,nums[i]),dp,nums);
  long skip=helper(i+1,gcd1,gcd2,dp,nums);
  
  long result=(c1%mod + c2%mod +skip%mod)%mod;
  return dp[i][gcd1][gcd2]=(int)result;



    }
}