def solution(arr) :
    answer = 0
    for i in range(len(arr)) :
        price = arr[i]
        if i % 4 == 0 :
            price //= 2
        answer += price
    return answer

print(solution([100,200,300,400,500]))