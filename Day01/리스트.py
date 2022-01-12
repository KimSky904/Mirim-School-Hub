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
