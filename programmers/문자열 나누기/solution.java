// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/140108

class Solution {
    public int solution(String s) {
        int answer = 0;
        int len = s.length();
        char rec = s.charAt(0);
        int leftCount = 0;
        int rightCount = 0;
        for (int i = 0; i < len; i++){
            if (rec == s.charAt(i)){
                leftCount++;                
                if (i == len-1) answer++;
            }
            else {
                rightCount++;
                if(leftCount == rightCount){
                    answer++;
                    if(i < len-1){
                        rec = s.charAt(i+1);
                        leftCount = 0;
                        rightCount = 0;
                    }
                } else if (i == len - 1){
                    answer++;
                }
            }
        }
        return answer = (len > 0 && answer == 0) ? 1 : answer;
    }
}