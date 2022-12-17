// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/87389?language=python3

def solution(n):
    answer = 0
    for i in range(n):
        if(n%(i+1)==1):
            answer = i+1;
            break;
    return answer