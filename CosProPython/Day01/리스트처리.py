arr = list(range(1,11))
sum = 0
for i in arr:
    sum += i
avg = sum / len(arr)
print("합계 : ",sum)
print("평균 : ",avg)


arr = [1,2,-4,56,8,89,77,23,4,22]
arr.sort()
print("정렬 후 : ",arr)
min = arr[0]
max = arr[len(arr)-1]
print("min : ",min)
print("max : ",max)

#특정요소 찾기
arr1 = [1,2,3,4,5]
index = arr1.index(3)
print(index)


#갯수 구하기
arr2 = [1,2,-4,56,8,89,77,23,8,22]
search_value = 8
count = arr2.count(search_value)
if(count==0): 
    print("없다.")
else :
    print(count,"개 있다.")


#복사
a = [1,2,3,4,5]
b = []
for i in a :
    b.append(i)
print(a,"vs",b)
a[0] = 10
print(a,"vs",b)



#추출
s = [1,2,3,4,5,6,7,8,9,10,11]
sliced = s[:4]
print(sliced)
sliced = s[4:]
print(sliced)
sliced = s[5:7]
print(sliced)

