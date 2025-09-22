a = float(input("Enter first number: "))
b = float(input("Enter second number: "))
c = float(input("Enter third number: "))

if a <= b and a <= c:
    if b <= c:
        print(a, b, c)
    else:
        print(a, c, b)

elif b <= a and b <= c:
    if a <= c:
        print(b, a, c)
    else:
        print(b, c, a)
elif c <= b and c <= a:
    if b <= a:
        print(c, b, a)
    else:
        print(c, a, b)
