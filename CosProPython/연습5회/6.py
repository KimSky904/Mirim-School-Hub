def solution(down,up):
    answer = 0
    passenger = 0
    n = len(up)
    for i in range(n) :
        passenger += up[i]-down[i]
        stand = passenger - 240
        if stand < 0 : 
            stand = 0
        if stand > 0 and stand > answer :
            answer = stand
    return answer


print(solution([240,100,0,160,10,140],[0,0,140,80,0,0]))