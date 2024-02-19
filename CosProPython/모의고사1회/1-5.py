def solution(number) :
    answer = 0
    for i in range(1,number+1) :
        current = i
        while current != 0 :
            unit = current % 10
            if unit == 3 or unit == 6 or unit == 9 :
                answer += 1
            current /= 10
    return answer


print(solution(12))