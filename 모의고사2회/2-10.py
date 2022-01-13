def sum_isbn(isbn) :
    sum = 0
    for i in range(len(isbn)) :
        sc = int(isbn[i])
        if i % 2 == 0 :
            sum += 3 * sc
        else : 
            sum += 1 * sc
    return sum

def solution(isbn) :
    answer = ''
    sum = sum_isbn(isbn[-1])
    r = 10 - (sum%10)
    if r == 10 : 
        answer = '0'
    else : 
        answer = str(r)
    return answer 


print(solution('9788970508122'))
