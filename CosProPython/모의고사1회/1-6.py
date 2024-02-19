def solution(left_rings) :
    answer = 0
    for i in range(len(left_rings)):
        if left_rings[i] <= i : 
            for k in range(i) :
                if left_rings[k] > left_rings[i] :
                    answer += 1
    return answer

print(solution([5,4,3,2,1]))