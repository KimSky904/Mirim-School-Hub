def solution(sentence) :
    str = ''
    for c in sentence :
        if c!='.' and c!=' ' :
            str +=c
    size = len(str)
    for i in range(size//2) :
        if str[i] != str[size-1-i] :
            return False
    return True


print(solution("palindrome"))
print(solution("never odd or even"))