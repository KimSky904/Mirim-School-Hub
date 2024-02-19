def solution(table) : 
    answer = 0
    max = 0
    #학년
    for i in range(1,len(table)) :
        sum = 0
        #학생 
        for j in range(5) :
            if table[0][j]==table[i][j] :  
                sum += 1
        if max < sum : 
            max = sum
            answer = i

    return answer

print(solution([[2,6,1,7,3],[2,9,4,6,8],[6,3,4,7,1],[7,7,1,1,2],[8,6,9,7,3],[4,6,5,9,2]]))