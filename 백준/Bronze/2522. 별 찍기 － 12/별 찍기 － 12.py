n = int(input())

# 원래는 이렇게 했는데, 아래와 같이 좀 더 범용적(?)으로도 할 수 있을 듯
# for i in range(n): print(" "*(n-i-1) + "*"*(i+1))
# for i in range(n-1, 0, -1): print(" "*(n-i) + "*"*i)

for i in range(1, n+1): print(" "*(n-i) + "*"*i)
for i in range(1, n): print(" "*i + "*"*(n-i))

'''
input = 3

1번
  *     i = 0, * 1, 2
 **     i = 1, * 2, 1
***     i = 2, * 3, 0
 **     i = 2, * 2, 1
  *     i = 1, * 1, 2

2번
  *     i = 1, * 1, 2
 **     i = 2, * 2, 1
***     i = 3, * 3, 0
 **     i = 1, * 2, 1
  *     i = 2, * 1, 2
'''