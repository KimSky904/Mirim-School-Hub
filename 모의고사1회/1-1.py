def solution(arr,k) :
    answer = 0 
    sum = 0
    for i in arr :
        sum += i

    answer = k - sum
    if answer < 0 : answer = -1

    return answer