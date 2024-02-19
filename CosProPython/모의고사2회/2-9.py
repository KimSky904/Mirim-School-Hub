def solution(orders) :
    answer = 0
    size = 0
    for o in orders :
        for i in range(6) :
            if o[i] != 0 :
                size += ((i+1)**2)*(o[i])
    answer = size // 36
    if size % 36 == 0 :
        answer  += 1
    return answer


print(solution([[0,0,4,0,1,1],[7,5,1,0,1,0]])) 