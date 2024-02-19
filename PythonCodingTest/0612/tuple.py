tuple1 = (1,2,3)
print(tuple1)
tuple2 = 1,2,3
print(tuple1)

list1 = [1,2,3]
tuple3 = tuple(list1)
print(tuple3)

print(tuple3[0])
print(tuple3[1])
print(tuple3[2])

#tuple3[0] = 5 -> typeError
#del tuple3[0] -> typeError