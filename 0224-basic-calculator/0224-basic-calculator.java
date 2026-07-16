class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
        int num=0;
        int res=0;
        int sign=1;
        for(int ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                num=num*10+ch-'0';

            }
            else if(ch=='+'){
                res=res+num*sign;
                num=0;
                sign=1;
            }
            else if(ch=='-'){
                res=res+num*sign;
                num=0;
                sign=-1;
            }
            else if(ch=='('){
                st.push(res);
                st.push(sign);
                num=0;
                res=0;
                sign=1;
            }
            else if(ch==')'){
                res +=num*sign;
                num=0;
                res=res*st.pop();
                res=res+st.pop();
            }


        }
        res=res+sign*num;
        return res;



       
        
    }
}