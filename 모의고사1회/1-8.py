def solution(sentence) :
    filtered = []
    for s in sentence : 
        if s != '' and s != '.' :
            filtered.append(s)
        before = filtered
        filtered.reverse()
        after = ''.join(filtered)
    return before==after


print(solution("r   ace c.a.r"))