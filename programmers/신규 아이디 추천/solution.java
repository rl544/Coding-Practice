// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/72410?language=java

class Solution {
    public String solution(String new_id) {
        String answer = "";
        answer = new_id.toLowerCase().replaceAll("[^a-z0-9[-]_[.]]","").replaceAll("[.]+",".");
        if(answer.charAt(0) == '.') answer = answer.substring(1);
        int len = answer.length();
        if(len == 0) answer = "a";
        len = answer.length();
        if(len >= 16) answer = answer.substring(0,15);
        while(answer.charAt(answer.length()-1)=='.'){
            answer = answer.substring(0,answer.length()-1);
        }
        len = answer.length();
        if (len <= 2){
            for(int i = 0; i < 3-len; i++){
                answer += answer.charAt(len-1);
            } 
        }
        
        return answer;
    }
}