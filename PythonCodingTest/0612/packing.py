a, b = 1,2
print(a)
print(b)
c = (3,4)
d,e = c
print(c)
print(d)
print(e)

f = d,e
print(f)

x = 5
y = 10
x,y = y,x
print(x)
print(y)

def tuple_func():
    return 1,2

q,w = tuple_func()
print(q)
print(w)
print(q,w)