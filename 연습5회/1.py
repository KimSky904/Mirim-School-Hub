def solution(arr) :
    answer = 0
    energy = 40
    for i in arr :
        energy -= i
        if energy < 0 :
            energy += 40
            answer += 1

    return answer





print(solution([20,10,30,30]))