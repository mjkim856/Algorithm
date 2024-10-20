while True:
    n = int(input())
    l1 = []
    add = 0

    if n != -1:
        for i in range(1, n):
            if n%i == 0: l1.append(i)

        for i in range(len(l1)):
            add += l1[i]

        if add == n:
            result = ' + '.join(map(str, l1)) 
            print(n, "=", result)
        else: print("%d is NOT perfect." % n)
    elif n == -1:
        break