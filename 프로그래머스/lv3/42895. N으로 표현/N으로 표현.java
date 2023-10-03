import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    //n을 사용한 개수가 dp의 인덱스 수, n을 i번 사용해서 나오는 연산 값을 dp에 저장
    public int solution(int N, int number) {
        int answer = -1;

        //dp 리스트 만들기
        List<HashSet<Integer>> dp=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            dp.add(new HashSet<>());
        }

        //N을 한번 사용한 경우는 N 단 하나 뿐
        dp.get(1).add(N);

        //n이 number와 같을경우
        if(N==number){
            return 1;
        }

        for (int i = 2; i < 9; i++) {

            //N을 i번 사용한 수 중에는 NN, NNN, NNNN 등 i의 개수만큼 붙여서 사용되는 경우도 있기 때문에 stringbuffer로 만들어줌
            StringBuffer sb=new StringBuffer();
            for (int j = 0; j < i; j++) {
                sb.append(N);
            }
            dp.get(i).add(Integer.parseInt(sb.toString()));

            //dp의 j번째와 i-j번째 값끼리 사칙연산
            for (int j = 1; j < i; j++) {
                int k=i-j;
                for(int num1:dp.get(j)){
                    for(int num2:dp.get(k)){
                        dp.get(i).add(num1+num2);
                        dp.get(i).add(num1-num2);
                        dp.get(i).add(num1*num2);
                        if(num2!=0){
                            dp.get(i).add(num1/num2);
                        }
                    }
                }
            }
            //number가 있으면 i리턴
            if(dp.get(i).contains(number)){
                return i;
            }
        }
        return answer;
    }
} 