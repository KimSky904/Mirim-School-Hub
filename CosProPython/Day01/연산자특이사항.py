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