def func_a(s) :
    s.sort()
    return s[len(s)-1],s[0]

def func_b(s):
    ret = 0
    for i in s :
        ret += i
    return ret

def func_c(s) :
    sum = func_b(s)
    max, min = func_a(s)
    return sum-max-min

print(func_c([10,20,50,90,30,40]))
