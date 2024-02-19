list2 = [12,23,34,45,56,67,87]
print(list2)


#리스트 요소 추가
list2.append(16)
print(list2)

list3 = list2 + [16]
print(list3)

n = 12
ownership = n in list3
print(ownership)

n = 10
if n in list3:
    print('Yes')

print(list2)
del list2[1]
print(list2)

list2.remove(45)
print(list2)