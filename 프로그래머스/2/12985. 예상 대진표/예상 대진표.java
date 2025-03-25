class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        for(int i=0;i<n;i++){
            if((a+1)/2==(b+1)/2){
                break;
            }
            round++;
            a=(a+1)/2;
            b=(b+1)/2;
        }

        return round;
    }
}