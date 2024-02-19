def basis():
    print('매개변수가 없는 함수 실행')

basis()
def basis(a):
    print('매개변수가 있는 함수 실행')

basis(10)

#[UP] 정상 작동

def basis():
    print('매개변수가 없는 함수 실행')
def basis(a):
    print('매개변수가 있는 함수 실행')

basis()
basis(10)

#[UP] 에러 발생 -> 이름이 같을 때 밑에 있는 함수가 인식됨 -> basis()에서 매개변수가 없으므로 인식 x
