#0부터 4까지 출력하기
for i in [0,1,2,3,4]:
    print(i)

#0부터 100까지 출력하기
for i in range(100): # ~=[0,1,2,3,4, - ,99,100]
    print(i)

names = ['철수', '영희', '바둑이', '하늘']

for i in range(len(names)): #names에 값을 추가해도 상관없음
    name = names[i]
    print('{}번 : {}'.format(i+1,name))

for i,name in enumerate(names):
    print('{}번 : {}'.format(i+1,name))

for i in range(11172):
    print(chr(44032+i),end='')