
def solution(price,grade) :
    answer = 0

    if grade == "S" :
        answer = price*0.95
    if grade == "V" :
        answer = price*0.9
    if grade == "G" :
        answer = price*0.85

    return int(answer)



print("할인 금액은 : ",solution(50000,"V"))