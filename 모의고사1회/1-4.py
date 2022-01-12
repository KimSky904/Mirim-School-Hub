def solution(price,grade) :
    answer = 0
    if grade=="S" :
        answer = price * 1.05
    elif grade == "G" :
        answer = price * 1.1
    else :
        answer = price * 1.15
    return int(answer)

print(solution(1000,"S"))