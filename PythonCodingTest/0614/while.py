#계속 반복함
selected = None
while selected not in ['가위','바위','보']:
    selected = input('가위, 바위, 보 중에 선택하세요 >> ' )
print('선택된 값은 : ',selected)


#한번만 실행 - 유사함
selected = None
if selected not in ['가위','바위','보']:
    selected = input('가위, 바위, 보 중에 선택하세요 >> ' )
print('선택된 값은 : ',selected)


patterns = ['가위','보','보']
for i in range(len(patterns)):
    print(patterns[i])

length = len(patterns)
i=0

while i < length:
    print(patterns[i])
    i = i+1