def solution(characters) :
    result = [characters[0]]
    for i in range(1,len(characters)) :
        if characters[i-1] != characters[i] :
            result.append(characters[i])
    return ''.join(result)

print(solution("senteeeencccceee"))