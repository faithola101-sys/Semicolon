p = 1000
r = 0.07
n = 10

for n in [10,20,30]:
  a = p * (1+r)**n
  print(f" for {n}years {a}")