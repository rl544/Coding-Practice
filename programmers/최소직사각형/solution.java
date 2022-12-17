// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/86491

class Solution {
    public int solution(int[][] sizes) {
        int answer, y, x = answer = 
            y = 0;
        for(int a = 0; a < sizes.length; a++){
            if(sizes[a][0]<sizes[a][1]) {
                sizes[a][0] += sizes[a][1];
                sizes[a][1] = sizes[a][0] - sizes[a][1];
                sizes[a][0] -= sizes[a][1];
                }
            x = (x<sizes[a][0])?sizes[a][0]:x;
            y = (y<sizes[a][1])?sizes[a][1]:y;
            }
        answer = x * y;
        return answer;
    }
}