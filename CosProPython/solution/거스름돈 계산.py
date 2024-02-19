def solution(price,money) :
    answer = 0
    sum = 0
    for i in price :
        sum += i
    answer = money - sum
    if answer<0 :
        return -1
    return answer