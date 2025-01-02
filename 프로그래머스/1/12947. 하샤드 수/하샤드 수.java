class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int temp=0;
            int xCop=x;
            while(xCop>=1){
                temp+=xCop%10;
                xCop/=10;
            }
            System.out.println(temp);
            return x%temp==0;
        }
    }