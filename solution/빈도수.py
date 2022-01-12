def solution(arr) :
    counter = [0 for _ in range(1001)]
    for i in arr :
        counter[arr[i]] += 1

    counter.sort()
    max = counter[len(counter)-1]
    min = counter[0]

    return int(max/min)

arr = [1,2,3,3,1,3,3,2,3,2]
ret = solution(arr)
print(ret)