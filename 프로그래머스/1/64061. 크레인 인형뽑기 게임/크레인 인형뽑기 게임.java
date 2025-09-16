import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> answerStack = new Stack<>();
        ArrayList<Stack<Integer>> list = new ArrayList<>();

        // 열(column) 기준으로 stack 생성
        for (int col = 0; col < board[0].length; col++) {
            Stack<Integer> stack = new Stack<>();
            for (int row = board.length - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    stack.push(board[row][col]);
                }
            }
            list.add(stack);
        }

        // moves 처리
        for (int move : moves) {
            if (list.get(move - 1).isEmpty()) continue;
            int doll = list.get(move - 1).pop();

            if (!answerStack.isEmpty() && doll == answerStack.peek()) {
                answerStack.pop();
                answer += 2; // 두 개 사라짐
            } else {
                answerStack.push(doll);
            }
        }

        return answer;
    }
}
