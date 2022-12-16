// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/12977

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int a = 0; a < nums.length-2; a++){
            for(int b = a+1; b< nums.length-1; b++){
                for(int c = b+1; c < nums.length; c++){
                    int sum = nums[a]+nums[b]+nums[c];
                    int lt = 0;
                    for(int d = 2; d < sum/2; d++){
                        lt = sum%d;
                        if(lt == 0) break;
                    }
                    if(lt != 0) {
                        answer += 1;
                        System.out.println(sum+" "+nums[a]+" "+nums[b]+" "+nums[c]+" "+lt+" "+answer);
                    }
                }
            }
        }
        return answer;
    }
}