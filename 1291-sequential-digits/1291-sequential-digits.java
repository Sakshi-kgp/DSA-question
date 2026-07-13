class Solution {
    
    public List<Integer> sequentialDigits(int low, int high) {
        int dlow=(int)Math.log10(low)+1;
        int dhigh=(int)Math.log10(high)+1;
       List<Integer>l=new ArrayList<>();
       String s="123456789";
       for(int i=dlow;i<=dhigh;i++){
        for(int s1=0;s1+i<=9;s1++){
        int no=Integer.parseInt(s.substring(s1,s1+i));
        if(no>=low && no<=high)l.add(no);
        }
        
       }

        
        return l;

        
    }
}