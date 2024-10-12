n = int(input())

for i in range(n): print(" "*(n-i-1) + "*"*(i+1))
for i in range(n-1, 0, -1): print(" "*(n-i) + "*"*i)


'''
input = 3

  *     i = 0, * 1, 2
 **     i = 1, * 2, 1
***     i = 2, * 3, 0
 **     i = 2, * 2, 1
  *     i = 1, * 1, 2

'''