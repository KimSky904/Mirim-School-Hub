def solution(weight,k) :
    answer = 0
    for w in weight :
        if w > k :
            answer += 1
    return answer   
