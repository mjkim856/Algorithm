import sys
input = sys.stdin.readline

n = int(input())

for i in range(n):
    ox = input()
    add = 0
    result = 0

    for i in range(len(ox)):
        if ox[i] == 'O':
            add += 1
            result += add
        else: add = 0
    print(result)