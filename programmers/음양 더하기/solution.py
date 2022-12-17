// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/76501

def solution(absolutes, signs):
    ans = []
    answer = 0
    for i in range(len(absolutes)):
        ans.append([])
        if signs[i] == True:
            ans[i] = absolutes[i]
        else:
            ans[i] = absolutes[i]*(-1)
        answer = answer + ans[i]
    return answer