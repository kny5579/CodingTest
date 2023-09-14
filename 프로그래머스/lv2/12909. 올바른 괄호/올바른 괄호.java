import java.util.LinkedList;
import java.util.Queue;

class Solution {
  boolean solution(String s) {

    Queue<Character> q=new LinkedList<>();

    for (int i = 0; i < s.length(); i++) {
      if(s.charAt(i)=='('){
        q.add(s.charAt(i));
      } else if (s.charAt(i)==')' && !q.isEmpty()) {
        q.poll();
      } else if(s.charAt(i)==')' && q.isEmpty()){
        return false;
      }
    }

    return q.isEmpty()?true:false;
  }
}