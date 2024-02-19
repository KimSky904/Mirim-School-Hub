def func_a(list) :
    total = 0
    for i in list :
        total += i
    return total 

def solution(total,arr) :
    result = []
    req_total = func_a(arr)
    for i in arr : 
        if req_total > total :
            result.append(total // len(arr))
        else : 
            result.append(i)
    return result

print(solution(100,[20,20,30,40]))