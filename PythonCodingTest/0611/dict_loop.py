#순서가 중요하다면 딕셔너리보다는 리스트를 사용할것.
seasons = ['봄','여름','가을','겨울']
for season in seasons:
    print(seasons)


ages = {'Tod':35,'Jane':23,'Paul':62}
print(ages)

#key : Tod, Jane, Paul
for key in ages.keys():
    print(key)

for value in ages.values():
    print(value)

for keye in ages.keys():
    print('{}의 나이는 {}입니다.'.format(keye,ages[keye]))
#동일함
for keye in ages:
    print('{}의 나이는 {}입니다.'.format(keye,ages[keye]))
#둘 다(키값과 그 값)
for keye in ages.items:
    print('{}의 나이는 {}입니다.'.format(keye,value))