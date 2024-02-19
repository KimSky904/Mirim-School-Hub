def solution(arr) :
    #arr2 = [0 for _ in range(0,len(arr))]
    # for i in range(len(arr)-1,-1,-1) :
    #     print(arr[i])

    left,right = 0,len(arr)-1
    while left<right :
        arr[left],arr[right] = arr[right],arr[left]
        left+=1
        right-=1
    return arr


arr = [1,2,3,4]
arr2 = solution(arr)
for i in arr2 :
    print(i)