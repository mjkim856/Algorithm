n = int(input())

for i in range(n):
    if i == 0: print(" "*(n-1) + "*")
    elif i < n-1: print(" "*(n-i-1) + "*" + " "*(i*2-1) + "*")
    else: print("*"*(n*2-1))

'''
input = 5

    *         0/1 4 1
   * *        1/2 3 1 1 1
  *   *       2/3 2 1 3 1
 *     *      3/4 1 1 5 1
*********     4/5 0 9

>> print("*"*(n*2-1)) 원래는 마지막에 이렇게 했는데
이렇게 하니 1을 입력하면 아래처럼 되어버렷다...!
*
*
'''