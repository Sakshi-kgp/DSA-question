class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
       int sumodd=n*(2+(n-1)*2)/2;
       int sumeven=n*(4+(n-1)*2)/2;
       return gcd(sumodd,sumeven);
        
    }
}