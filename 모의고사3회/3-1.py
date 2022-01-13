def solution(a,b) :
    answer = 0
    diff = (b - a)
    if diff < 0 : diff *= -1
    answer = 10/diff
    return answer*60

print(solution(10,12))