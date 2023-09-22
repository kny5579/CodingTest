class Solution {
    public boolean solution(int x) {
        int sum=0;
        String strX=Integer.toString(x);
        for(String s:strX.split("")){
            sum+=Integer.parseInt(s);
        }
        return x%sum==0?true:false;
    }
}