def print_root(a,b,c):
    r1 = (-b+(b**2-4*a*c)**0.5)/(2*a)
    r2 = (-b-(b**2-4*a*c)**0.5)/(2*a)
    return r1,r2
    

a=1
b=2
c=-8
r1,r2 = print_root(a,b,c)
print('해는 {} 또는 {}'.format(r1,r2))