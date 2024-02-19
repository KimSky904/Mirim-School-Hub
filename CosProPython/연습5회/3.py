def func_a(a,length) : 
    for i in range(len(a)) : 
        if a[i] >= length : 
            return i
    return -1

def solution(N,orders) : 
    material = [8 for _ in range(N)] 
    k = 0
    price = 0
    for o in orders : 
        k = func_a(material,o)
        if k >= 0 : 
            material[k] -= o
            price += 3000 * o

    return price

print(solution(10,[1,3,5,7,8]))
