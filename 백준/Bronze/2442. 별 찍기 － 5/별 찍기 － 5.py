n = int(input())

for i in range(n): print(" "*(n-1-i) + "*"*(i*2+1))
'''
input = 5
    *           i = 0, * 1, 4
   ***          i = 1, * 3, 3
  *****         i = 2, * 5, 2
 *******        i = 3, * 7, 1
*********       i = 4, * 9, 0
'''