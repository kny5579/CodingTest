 class Solution {
     fun solution(seoul: Array<String>): String {
         var answer = ""
         for((idx,name) in seoul.withIndex()){
             if(name.equals("Kim")){
                 return "김서방은 ${idx}에 있다"
             }
         }
         return answer
     }
 }