def add_10(value):
    if value < 10:
        return 10
    result = value+10
    return result

n = add_10(42.5)
print(n)

n = round(n)
print(n)

print(round(1.5))

n = add_10(5)
print(n)