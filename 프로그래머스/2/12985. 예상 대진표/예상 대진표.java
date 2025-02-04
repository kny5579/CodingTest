class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int aCopy = a;
        int bCopy = b;
        if(a>b) {
            aCopy=b;
            bCopy=a;
        }
        while(aCopy!=bCopy) {
            aCopy=++aCopy/2;
            bCopy=++bCopy/2;
            answer++;
        }

        return answer;
    }
}