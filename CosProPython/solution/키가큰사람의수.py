def solution(height,k):
    answer = 0
    n = len(height)
    for i in height:
        if i>k:
            answer += 1

    return answer   

print(solution([1,2,3,4,5,6],3))
    