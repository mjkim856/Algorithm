t = int(input())

for i in range(t):
    li = input().split()
    n = float(li[0])

    for i in li:
        if i == '@': n*=3
        elif i == '%': n+=5
        elif i == '#': n-=7

    print("{:.2f}".format(n))