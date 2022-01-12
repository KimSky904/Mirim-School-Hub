def solution(n,m) :
    sum1 = 0
    sum2 = 0
    for i in range(n) :
        sum1 += i
    for i in range(m) :
        sum2 += i

    return sum2-sum1


print(solution(4,10))