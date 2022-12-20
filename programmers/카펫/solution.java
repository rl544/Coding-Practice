// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/42842

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        for(int f = 3; f < 2500; f++){
            for(int g = 1; g < 500000000; g++){
                if(f<g) break;
                else if(brown == 2*f + 2*g - 4 && yellow == f*g - 2*f - 2* g + 4) {
                    answer = new int[] {f,g};
                    break;
                }
            }
            if(answer.length > 0) break;
        }
        return answer;
    }
}