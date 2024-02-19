def solution(arr,payload) :
    total = 0
    for i in arr :
        total += i
    answer = 0
    if total >= payload :
        arr.sort()
        arr.reverse()
        weight = 0
        for i in range(len(arr)) : 
            diff = payload - weight
            if arr[i] <= diff :
                weight += arr[i]
                answer += 1
        if weight != payload :
            answer = 0
    return answer

print(solution([2,3,5,7,13,17,19,23],25))