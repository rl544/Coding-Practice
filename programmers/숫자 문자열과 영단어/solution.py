// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/81301?language=python3

def solution(s):
    words = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
    for i in range(len(words)):
        s = s.replace(words[i], str(i))
    return int(s)