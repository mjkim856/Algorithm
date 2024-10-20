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

# 리스트의 요소를 더하는 건 sum(list_name) 으로도 할 수 있다.
# 다만 초는 56ms로 이 코드(52ms)보다 느리게 나온당
