def solution(list) :
    answer = [0]*6
    

    for size in list : 
        if size == 7 : 
            answer[0] += 1
        elif size == 7.5: 
            answer[1] += 1
        elif size == 8 : 
            answer[2] += 1
        elif size == 8.5 : 
            answer[3] += 1
        elif size == 9 : 
            answer[4] += 1
        else : 
            answer[5] += 1

    return answer


print(solution([7,7.5,8,8.5,9,9.5]))