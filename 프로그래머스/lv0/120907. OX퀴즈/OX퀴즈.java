class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String[] arr=quiz[i].split(" ");
            int ans=0;
            if(arr[1].equals("-")){
                ans=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
            }else if(arr[1].equals("+")){
                ans=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
            }
            if(ans==Integer.parseInt(arr[4])){
                answer[i]="O";
            }else if(ans!=Integer.parseInt(arr[4])){
                answer[i]="X";
            }
        }
        return answer;
    }
}