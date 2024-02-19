def solution(wats,bill):
    result = [0 for _ in range(8)]
    unit_price = int(bill/wats[0]) + 1
    for i in range(len(wats)) :
        result[i] = wats[i+1]*unit_price
    return result

print(solution([1124,224,213,104,124,221,79,94,65]))
