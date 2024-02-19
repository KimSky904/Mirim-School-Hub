number = 20
greeting = '안녕하세요'
place = '문자열 포맷의 세계'
welcome = '환영합니다'

print(number,'번 손님',greeting,'.',place,'에 오신 것을',welcome)

base = '{}번 손님, {}. {}에 오신 것을 {}'
new_way = base.format(number,greeting,place,welcome)

print(base)
print(new_way)

#{}의 갯수와 format변수의 갯수를 맞추는 것에 유의!