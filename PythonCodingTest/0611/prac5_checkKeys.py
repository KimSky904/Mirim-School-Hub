def check_and_clear(box):
    if "불량품" in box.keys():
        box.clear()

box1 = {"불량품" : 10}
check_and_clear(box1)
# {}가 출력되어야합니다.
print(box1)

box2 = {"정상품": 10}
check_and_clear(box2)
# {"정상품": 10}가 출력되어야합니다.
print(box2)