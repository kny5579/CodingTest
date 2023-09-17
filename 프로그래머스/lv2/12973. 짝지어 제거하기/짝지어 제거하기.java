import java.util.Stack;

class Solution
{
  public int solution(String s)
  {
    Stack<String> stack=new Stack<>();
    for(String a:s.split("")){
      if(!stack.isEmpty()&&stack.peek().equals(a)){
        stack.pop();
      }else {
        stack.push(a);
      }
    }

    return stack.size()==0?1:0;
  }
}