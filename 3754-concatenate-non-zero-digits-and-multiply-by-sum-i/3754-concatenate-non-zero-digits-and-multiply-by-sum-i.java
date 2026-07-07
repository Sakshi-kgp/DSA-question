class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        StringBuilder sb=new StringBuilder();
        long sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='0'){
                sb.append(ch);
                sum+=ch-'0';
            }
        }
        String ans=sb.toString();
        if(ans.length()==0)return 0;
        long no=Long.parseLong(ans);
        return no*sum;
        
    }
}