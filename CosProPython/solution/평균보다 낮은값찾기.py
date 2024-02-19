def sum(data) :
    total = 0
    for d in data :
        total += d
    return total

def solution(data) :
    total = sum(data)
    average = total / len(data)
    cnt = 0
    for d in data :
        if d<=average :
            cnt +=1 

    return cnt 

print(solution([1,2,3,4,5,6]))