a = 1
#증감연산자는 Python에서 사용할 수 없음
#a++
print(a)

#나누기
a,b = 23,4
c = a/b
print(c,type(c))
d = int(a/b)
print(d,type(d))
e = a//b
print(e,type(e))

#관계연산자
#is연산자와 ==
#is는 참조를, ==은 값을 비교
a,b = 20,20
print(a is b)   #true
print(a==b)     #true
c,d = [10],[10] 
print(c is d)   #False - list는 메모리가 따로 할당됨
print(c==d)     #true

#논리연산자
a = 5
b = 7
print((a<b)and(a>0))    #True
print(not(a<b))         #False
print(1<a<10)           #True
x = 2
print(x>=0 and x<100)   #True
print(0<=x<100)         #True

#if문 조건식
var = 100
if var == 100 :
    print("2space")
    print("4space")
    print("tab")
    
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

first = [1,2,3]
second = [1,2,3]
#복사
second = first
print("first vs second : ",first,"  ",second)
#수정
first[0] = 10
print("first vs second : ",first,"  ",second)
#복사
first2 = [1,2,3]
second2 = first2.copy()
print("first vs second : ",first,"  ",second)
#수정
first2[0] = 60
print("first vs second : ",first,"  ",second)


numbers = [1,2,3,4,5,6,7,8,9,10]
print(numbers)
print("numbers is ",type(numbers), len(numbers))
print(numbers[0]) #4,5라인 같은값
print(numbers[-10])

a = [1,2,3]
b = [4,5,6]
print(a+b)
print(a*2)


#append
lists = [1,2,3,4,5]
lists.append(6)
print(lists[5])
print(type(lists[5]))

#리스트 안에 또다른 리스트를 한번에 추가
first = [1,2,3]
second = [4,5,6]
#append와 +의 차이

first.append(second)
print(first)
#print(first[3])
#-> 2차원의 개념으로 사용 가능
print(first[3])
print(first[3][0])


first.remove(second)
print(first)

first=first+second
print(first)
