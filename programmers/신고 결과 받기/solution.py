// [문제 링크]: https://school.programmers.co.kr/learn/courses/30/lessons/92334?language=python3

def solution(id_list, report_list, k):
    report_list = set(report_list)
    cnt = []
    r = []
    l = []
    li = len(id_list)
    cnt = [0] * li
    tmp = 0
    dlist = []
    ans = cnt.copy() 
    for report in report_list:
        r.append(report.split()[1])
        l.append(report.split()[0])
        cnt[id_list.index(report.split()[1])] += 1
    for id in range(li):
        if cnt[id] >= k:
            dlist.append(id_list[id])
    for ice in range(len(r)):
        tmp = r[ice]
        if tmp in dlist:
            ans[id_list.index(l[ice])] += 1
    return ans