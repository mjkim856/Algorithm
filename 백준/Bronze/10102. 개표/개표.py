n = int(input())
v = input()

a = v.count('A')
b = n - a

if a > b: print('A')
elif b > a: print('B')
else: print('Tie')