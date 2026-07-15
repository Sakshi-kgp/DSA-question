class Solution {
public int gcd(int a,int b){
    return b==0?a:gcd(b,a%b);
}
    public int countBeautifulPairs(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String s=String.valueOf(nums[i]);
                String s1=String.valueOf(nums[j]);
                int first=s.charAt(0)-'0';
                int last=s1.charAt(s1.length()-1)-'0';
                
                if(gcd(first,last)==1){
                    c++;
                    System.out.println(first + ","+last);
                }
            }
        }
        return c;
        
    }
}