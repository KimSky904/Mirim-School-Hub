list = [1,2,3,4,5]
print(list)
list[2] = 33

#list[5] = 6  => IndexError 발생
list.append(6)
print(list)
del (list[0])
print(list)
#pop -> 지우면서 지운 값을 return
print(list.pop(0))
"""
[1, 2, 3, 4, 5]
[1, 2, 33, 4, 5, 6]
[2, 33, 4, 5, 6]
2
"""


dict = {'one':1,'two':2}
print(dict)
dict['one'] = 3
print(dict)
dict['three'] = 3
print(dict)
del (dict['one'])
print(dict)
print(dict.pop('two'))
print(dict)
"""
{'one': 1, 'two': 2}
{'one': 3, 'two': 2}
{'one': 3, 'two': 2, 'three': 3}
{'two': 2, 'three': 3}
2
{'three': 3}
"""

#정리
#추가 / 수정
dict['four'] = 4
#삭제
del(dict['four'])
dict.pop('four')