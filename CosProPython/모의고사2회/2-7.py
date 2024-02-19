def solution(str) :
    answer = []
    for c in str :
        if '0'<=c<='9' :
            n = ord('i') - ord(c)
            c = chr(n)
        answer.append(c)
    return ''.join(answer)

print(solution("ab9c43"))