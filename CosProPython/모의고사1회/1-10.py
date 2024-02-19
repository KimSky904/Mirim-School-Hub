def solution(data) :
    total = 0
    for i in data :
        total += i
    cnt = 0
    average = total // len(data)
    for i in data :
        if i<average :
            cnt += 1
    return cnt

print(solution([1,2,3,4,5,6,7,8,9,10]))