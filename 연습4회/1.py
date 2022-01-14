def solution(cards) : 
    answer = 0
    for one in range(3) :
        for two in range(one+1,5) :
            for three in range(two+1,5) : 
                if (cards[one]+cards[two]+cards[three]) % 2 == 1 :
                    answer += 1

    return answer


print(solution([3,5,2,7,6]))
