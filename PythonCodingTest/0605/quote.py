string1 = 'Some Text'
string2 = "어떤 텍스트"
string3 = '{}도 {}도 지금 이것도 문자열'.format(string1,string2)

print(string1,string2,string3)

quote = '문법검사기 왈 "직접인용은 큰따옴표다"'
emphasize = "'문법검사기'를 인용하다니"

#파이썬은 줄바꿈을 ; 처럼 인식한다.
#이 떄 긴글입력은 따옴포 3개('''  ''', """  ""","'"  "'")를 사용한다.
print(quote)
print(emphasize)