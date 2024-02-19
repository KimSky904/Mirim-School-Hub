#공통점
#생성
list = [1,2,3]
dict = {'one':1,'two':2,'three':3}
#호출
list[0]
dict['one']
#삭제
del(list[0])
del(dict['one'])
#개수확인
len(list)
len(dict)
#값 확인
2 in list
'two' in dict.keys()
#전부 삭제
list.clear()
dict.clear()

#차이점
#List -> 요소 삭제 후 인덱스와 그 값의 매칭이 달라짐(순서변경)
#List -> 두 개를 더할 때 편리함
#big_list = [1,2,3]+[4,5,6]
#big_list2 = list1 + list2

#Dict -> 요소를 삭제해도 key값으로 값을 가져오기 때문에 변화가 없음
#Dict -> 두 개를 더할 때 같은 key값이 존재할 수 있기 때문에,, 쉽지않음
#dict1 = {1:100,2:200}
#dict2 = {1:1000,3:300}
#dict1.update(dict2)
#-> {1:1000,2:200,3:300}

#dict1 = {1:100,2:200}
#dict2 = {1:1000,3:300}
#dict2.update(dict1)
#-> {1:100,2:200,3:300}
