class Solution {
     fun solution(phone_number: String): String {
         var answer =""
         for(i in 1..phone_number.length-4){
             answer+="*"
         }
         return answer+phone_number.substring(phone_number.length-4,phone_number.length)
     }
 }