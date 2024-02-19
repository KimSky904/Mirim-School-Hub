def func_a(a) :
    return ((a//100)*60)+(a%100)

def solution(arr) :
    answer = 0
    min_a = func_a(2200)
    for i in arr : 
        min_b = func_a(i)
        elapsed_minute = min_a - min_b
        answer += 1000 + (elapsed_minute//10)*500
    return answer

print(solution([2000,2200]))