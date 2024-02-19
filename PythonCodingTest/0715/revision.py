for i in [1,2,3,4,5,6]:
    if i%2==0 :
        print(i,'는 짝수입니다.')
    else :
        print(i,'는 홀수입니다.')

a = 0
while a<5:
    print(a)
    a+=1


def check2(num):
    if num%2==0 :
        return "짝수"
    else :
        return "홀수"

print(check2(5))
    
print("hello\a\a\a")

str = "hello"*5
print(str)
print(len(str))
print(str[2])
print(str[0:4]) #문자열 슬라이싱    start ~ end-1

str2 = "hiiii-0"
print(str2[0:])


print("%d는 숫자이다." %3)
print("%s는 문자열이다." %"hello")
print("나는 {}개의 사과를 먹는다.".format(3))
print("나는 2개의 {}를 먹는다.".format("사과"))
print("나는 {}개의 {}를 먹는다.".format(5,"사과"))
print("나는 {number}개의 {apple}를 먹는다.".format(number=10,apple="사과"))
print("나는 {}개의 {apple}를 먹는다.".format(10,apple="사과"))
# :<  -> 왼쪽정렬
# :>  -> 오른쪽정렬
# :^  -> 가운데정렬

name = "김하늘"
print(f'{name}씨, 안녕하세요')

