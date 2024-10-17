n = int(input())

for i in range(1, n+1): print("*"*i)
for i in range(n-1, 0, -1): print("*"*i)

'''
input = 3

*       i = 1, * 1
**      i = 2, * 2
***     i = 3, * 3
**      i = 2, * 2
*       i = 1, * 1
'''