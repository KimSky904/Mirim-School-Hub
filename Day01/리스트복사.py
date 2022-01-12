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
