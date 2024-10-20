a = input()
h = 10

for i in range(1, len(a)):
    if a[i] == a[i-1]: h += 5
    else: h += 10

print(h)