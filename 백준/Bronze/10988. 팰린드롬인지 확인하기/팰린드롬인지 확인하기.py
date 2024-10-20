a = input()
len = len(a)

# for-else문 사용
for i in range(0, round(len/2)):
    if a[i] != a[len-i-1]: 
        print(0)
        break
else: print(1)